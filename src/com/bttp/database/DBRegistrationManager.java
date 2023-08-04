package com.bttp.database;

import com.bttp.pojo.Book;
import com.bttp.pojo.Comment;
import com.bttp.pojo.Employee;
import com.bttp.pojo.Generator;
import com.bttp.pojo.Learner;
import com.bttp.pojo.Subject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBRegistrationManager {

    private final Connection connection;
    private final Statement statement;
    private ResultSet set;

    public DBRegistrationManager() throws ClassNotFoundException, SQLException {
        Connector c = new Connector();
        connection = c.getConnection();
        statement = connection.createStatement();
    }

    //New employee
    public int newEmployeeRegistration(Employee employee) throws SQLException {
        String query = "INSERT INTO tblusers(employeeno, firstname, lastname, identityno, email, contactno, occupation)"
                + "VALUES('" + employee.getEmployeeno() + "', '" + employee.getFirstname() + "', "
                + "'" + employee.getLastname() + "', '" + employee.getIdentityno() + "', "
                + "'" + employee.getEmail() + "', '" + employee.getContactno() + "', '" + employee.getOccupation() + "')";
        return executeAllUpdates(query);
    }

    //New learner 
    public int newLearnerRegistration(Learner learner) throws SQLException {
        String query = "INSERT INTO tbllearners(learnerno, firstname, lastname, identityno, grade, "
                + "pfirstname, plastname, pidentityno, contactno, residentialaddress, dateofregistration)"
                + "VALUES('" + learner.getLearnerno() + "', '" + learner.getFirstname() + "', "
                + "'" + learner.getLastname() + "', '" + learner.getIdentityno() + "', "
                + "'" + learner.getGrade() + "', '" + learner.getPfirstname() + "', "
                + "'" + learner.getPlastname() + "', '" + learner.getPidentityno() + "', "
                + "'" + learner.getContactno() + "', '" + learner.getResidentialaddress() + "', "
                + "'" + new Generator().currentDate() + "')";
        return executeAllUpdates(query);
    }

    //New book 
    public int newBookRegistration(Book book) throws SQLException {
        String query = "INSERT INTO tblbooks(title, author, ISBN, publisher, status, quantity, year)"
                + "VALUES('" + book.getTitle() + "', '" + book.getAuthor() + "', "
                + "'" + book.getISBN() + "', '" + book.getPublisher() + "', "
                + "'" + book.getStatus() + "', '" + book.getQuantity() + "', "
                + "'" + book.getYear() + "')";
        return executeAllUpdates(query);
    }

    public boolean isEmployeeRegistered(String employeeno, String identityno) throws SQLException {
        String query = "SELECT * FROM tblusers, tbllogin WHERE identityno = identitynoFK AND employeeno = '" + employeeno + "' AND identityno = '" + identityno + "'";
        set = statement.executeQuery(query);
        return set.next();
    }

    public int editContactNo(String employeeno, String contactno) throws SQLException {
        String query = "UPDATE tblusers SET contactno = '" + contactno + "' WHERE employeeno = '" + employeeno + "'";
        return executeAllUpdates(query);
    }

    public int registerLogin(String username, String password, String identityno) throws SQLException {
        String query = "INSERT INTO tbllogin(username, password, identitynoFK)VALUES('" + username + "', '" + password + "', '" + identityno + "')";
        return executeAllUpdates(query);
    }

    public Employee login(String username, String password) throws SQLException {
        Employee user = null;
        String query = "SELECT * FROM tblusers, tbllogin WHERE identityno = identitynoFK AND username = '" + username + "' AND password = '" + password + "'";
        set = statement.executeQuery(query);
        if (set.next()) {
            user = new Employee(set.getString("employeeno"), set.getString("firstname"),
                    set.getString("lastname"), set.getString("identityno"),
                    set.getString("email"), set.getString("contactno"),
                    set.getString("occupation"));
        }
        return user;
    }

    public String[] forgottenPassword(String employeeno, String identityno) throws SQLException {
        String[] arr = new String[2];
        String query = "SELECT password, email FROM tbllogin, tblusers WHERE identityno = identitynoFK AND employeeno = '" + employeeno + "' AND identitynoFK = '" + identityno + "'";
        set = statement.executeQuery(query);
        if (set.next()) {
            arr[0] = set.getString(1);
            arr[1] = set.getString(2);
        }
        return arr;
    }

    public int editProfile(String lastname, String email, String contactno, String identityno) throws SQLException {
        String query = "UPDATE tblusers SET lastname = '" + lastname + "', email = '" + email + "', contactno = '" + contactno + "' WHERE identityno = '" + identityno + "'";
        return executeAllUpdates(query);
    }

    public int changePassword(String oldpassword, String newpassword, String identityno) throws SQLException {
        String query = "UPDATE tbllogin SET password = '" + newpassword + "' WHERE password = '" + oldpassword + "' AND identitynoFK = '" + identityno + "'";
        return executeAllUpdates(query);
    }

    public ArrayList<Learner> retrieveLearners() throws SQLException {
        ArrayList<Learner> learners = new ArrayList<>();
        String query = "SELECT * FROM tbllearners";
        set = statement.executeQuery(query);
        while (set.next()) {
            String learnerno = set.getString("learnerno");
            String firstname = set.getString("firstname");
            String lastname = set.getString("lastname");
            String identityno = set.getString("identityno");
            String grade = set.getString("grade");
            String pfirstname = set.getString("pfirstname");
            String plastname = set.getString("plastname");
            String pidentityno = set.getString("pidentityno");
            String contactno = set.getString("contactno");
            String residentialaddress = set.getString("residentialaddress");
            String dateofregistration = set.getString("dateofregistration");
            learners.add(new Learner(learnerno, firstname, lastname, identityno, grade,
                    pfirstname, plastname, pidentityno, contactno, residentialaddress, dateofregistration));
        }
        return learners;
    }

    public ArrayList<Book> retrieveBooks() throws SQLException {
        ArrayList<Book> books = new ArrayList<>();
        String query = "SELECT * FROM tblbooks";
        set = statement.executeQuery(query);
        while (set.next()) {
            String title = set.getString("title");
            String author = set.getString("author");
            String ISBN = set.getString("ISBN");
            String publisher = set.getString("publisher");
            String status = set.getString("status");
            String quantity = set.getString("quantity");
            String year = set.getString("year");
            books.add(new Book(title, author, ISBN, publisher, status, quantity, year));
        }
        return books;
    }

    public int postComment(Comment comment) throws SQLException {
        String query = "INSERT INTO tblcomments(identitynoFK, comment, postDate, postTime)VALUES("
                + "'" + comment.getIdentityno() + "', "
                + "'" + comment.getComment() + "', "
                + "'" + comment.getPostDate() + "', "
                + "'" + comment.getPostTime() + "')";
        return executeAllUpdates(query);
    }

    public ArrayList<Comment> retrieveComments() throws SQLException {
        ArrayList<Comment> comments = new ArrayList<>();
        String query = "SELECT * FROM tblcomments, tblusers WHERE identityno = identitynoFK";
        set = statement.executeQuery(query);
        while (set.next()) {
            String user = set.getString("firstname") + " " + set.getString("lastname");
            comments.add(new Comment(set.getInt("commentID"), user, set.getString("comment"), set.getString("postDate"), set.getString("postTime")));
        }
        return comments;
    }

//    public static void main(String[] args) {
//        try {
//            DBRegistrationManager manager = new DBRegistrationManager();
////            Generator g = new Generator();
////            Comment comment = new Comment(1, "9912095673080", "Hello", g.currentDate(), g.currentTime());
////            System.out.println(manager.postComment(comment));
//            ArrayList<Comment> comments = manager.retrieveComments();
//            for (Comment comment : comments) {
//                System.out.println(comment.getIdentityno() + "\t" + comment.getComment() + "\t" + comment.getPostDate() + "\t" + comment.getPostTime());
//            }
//            manager.closeConnection();
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public ArrayList<Course> courses(String facultyname) throws SQLException {
//        ArrayList<Course> courses = new ArrayList<>();
//        String query = "SELECT * FROM tblcourse, tblfaculty WHERE facultycode = facultycodeFK AND facultyname = '" + facultyname + "'";
//        set = statement.executeQuery(query);
//        while (set.next()) {
//            courses.add(new Course(set.getString("coursecode"), set.getString("coursename")));
//        }
//        return courses;
//    }
//    public ArrayList<CoursePoints> allCourses() throws SQLException {
//        ArrayList<CoursePoints> courses = new ArrayList<>();
//        String query = "SELECT * FROM tblcourse, tblfaculty WHERE facultycode = facultycodeFK", coursePoints;
//        set = statement.executeQuery(query);
//        while (set.next()) {
//            switch (set.getString("facultycode")) {
//                case "Hum":
//                    coursePoints = "20";
//                    break;
//                case "Eng":
//                    coursePoints = "26";
//                    break;
//                default:
//                    coursePoints = "32";
//                    break;
//            }
//            courses.add(new CoursePoints(set.getString("coursecode"), set.getString("coursename"), coursePoints));
//        }
//        return courses;
//    }
//    public Course studentCourse(String employeeno) throws SQLException {
//        Course course = null;
//        String query = "SELECT * FROM tblcourse WHERE coursecode = (SELECT coursecodeFK FROM tblusers WHERE employeeno = '" + employeeno + "')";
//        set = statement.executeQuery(query);
//        if (set.next()) {
//            course = new Course(set.getString("coursecode"), set.getString("coursename"));
//        }
//        return course;
//    }

    public ArrayList<Subject> subjects(String coursename) throws SQLException {
        ArrayList<Subject> subjects = new ArrayList<>();
        String query = "SELECT * FROM tblsubjects, tblcourse WHERE coursecode = coursecodeFK AND coursename = '" + coursename + "'";
        set = statement.executeQuery(query);
        while (set.next()) {
            subjects.add(new Subject(set.getString("subjectcode"), set.getString("subjectname")));
        }
        return subjects;
    }

//    public ArrayList<Course> apply(int subject_1, int subject_2) throws SQLException {
//        ArrayList<Course> courses = new ArrayList<>();
//        String query = "SELECT * FROM tblpoints p, tblfaculty f, tblcourse c WHERE f.facultycode = p.facultycodeFK AND f.facultycode = c.facultycodeFK";
//        set = statement.executeQuery(query);
//        while (set.next()) {
//            if (subject_1 >= set.getInt("Subject_1") && subject_2 >= set.getInt("Subject_2")) {
//                courses.add(new Course(set.getString("coursecode"), set.getString("coursename")));
//            }
//        }
//        return courses;
//    }
//    public ArrayList<Course> suggestedCourse(int subject_1, int subject_2) throws SQLException {
//        ArrayList<Course> courses = new ArrayList<>();
//        String query = "SELECT * FROM tblpoints p, tblfaculty f, tblcourse c "
//                + "WHERE f.facultycode = p.facultycodeFK "
//                + "AND f.facultycode = c.facultycodeFK";
//        set = statement.executeQuery(query);
//        while (set.next()) {
//            if (set.getInt("Subject_1") > subject_1 && set.getInt("Subject_2") > subject_2) {
//            } else {
//                courses.add(new Course(set.getString("coursecode"), set.getString("coursename")));
//            }
//        }
//        return courses;
//    }
//    public int[] matricResults(String identitynoFK) throws SQLException {
//        int[] results = new int[3];
//        String query = "SELECT * FROM tblmatricresults WHERE identitynoFK = '" + identitynoFK + "'";
//        set = statement.executeQuery(query);
//        if (set.next()) {
//            results[0] = set.getInt("MATHS");
//            results[1] = set.getInt("SCIENCE");
//            results[2] = set.getInt("ENGLISH");
//        }
//        return results;
//    }
//    public int updateCourseCode(String studentno, String coursename) throws SQLException {
//        String query = "UPDATE tblusers SET coursecodeFK = (SELECT coursecode FROM tblcourse WHERE coursename = '" + coursename + "') WHERE studentno = '" + studentno + "'";
//        return executeAllUpdates(query);
//    }
    public int makePayment(String studentnoFK, double amount) throws SQLException {
        String query;
        if (isRegistrationPayed(studentnoFK)) {
            query = "UPDATE tblpayments SET amountPayed = amountPayed + " + amount + " WHERE studentnoFK = '" + studentnoFK + "'";
        } else {
            query = "INSERT INTO tblpayments(studentnoFK, amountPayed)VALUES('" + studentnoFK + "', " + amount + ")";
        }
        return executeAllUpdates(query);
    }
//
//    public String retrieveStatus(String identitynoFK) throws SQLException {
//        String query = "SELECT * FROM tblstatus WHERE identitynoFK = '" + identitynoFK + "'", status = "";
//        set = statement.executeQuery(query);
//        if (set.next()) {
//            status = set.getString("status");
//        }
//        return status;
//    }

    public int status(String identitynoFK, String status) throws SQLException {
        String query = "INSERT INTO tblstatus SET identitynoFK = '" + identitynoFK + "', status = '" + status + "'";
        return executeAllUpdates(query);
    }

    public boolean isRegistrationPayed(String studentnoFK) throws SQLException {
        set = statement.executeQuery("SELECT * FROM tblpayments WHERE studentnoFK = '" + studentnoFK + "'");
        return set.next();
    }

    public int executeAllUpdates(String sql) throws SQLException {
        return statement.executeUpdate(sql);
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }
}
