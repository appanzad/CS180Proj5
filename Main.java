import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    //ALL FRAMES
    public static JFrame maineMenuFrame;
    public static JFrame createTeacherFrame;
    public static JFrame accountCreatedTeacherFrame;
    public static JFrame teacherLogInFrame;
    public static JFrame teacherMenuFrame;
    public static JFrame addCourseFrame;
    public static JFrame teacherQuizMenuFrame;
    public static JFrame createQuizFrame;
    public static JFrame multipleChoiceQuizFrame;
    public static JFrame trueOrFalseQuizFrame;
    public static JFrame addAnotherQuestionFrame;
    public static JFrame editQuizFrame;
    public static JFrame editTeacherAccountFrame;
    public static JFrame editTeachAccountDoneFrame;
    public static JFrame createStudentFrame;
    public static JFrame accountCreatedStudentFrame;
    public static JFrame studentLogInFrame;
    public static JFrame studentMenuFrame;
    public static JFrame chooseCourseForTakeQuizFrame;
    public static JFrame whichQuizToTakeFrame;
    public static JFrame quizStudentTakesFrame1;
    public static JFrame quizSubmittedFrame;
    public static JFrame viewGradedQuizFrame;
    public static JFrame editStudentAccountFrame;
    public static JFrame editStudentAccountDoneFrame;
    public static JFrame questionForEditQuizFrame;
    public static JFrame deleteQuizFrame;
    public static JFrame quizDeletedFrame;
    public static JFrame viewStudentQuizSubmissionsFrame;
    public static JFrame stuGradedQuizFrame;
    //ALL PANELS
    public static JPanel maineMenuPanel;
    public static JPanel createTeacherPanel;
    public static JPanel accountCreatedTeacherPanel;
    public static JPanel teacherLogInPanel;
    public static JPanel teacherMenuPanel;
    public static JPanel addCoursePanel;
    public static JPanel teacherQuizMenuPanel;
    public static JPanel createQuizPanel;
    public static JPanel multipleChoiceQuizPanel;
    public static JPanel trueOrFalseQuizPanel;
    public static JPanel addAnotherQuestionPanel;
    public static JPanel editQuizPanel;
    public static JPanel editTeacherAccountPanel;
    public static JPanel editTeachAccountDonePanel;
    public static JPanel createStudentPanel;
    public static JPanel accountCreatedStudentPanel;
    public static JPanel studentLogInPanel;
    public static JPanel studentMenuPanel;
    public static JPanel chooseCourseForTakeQuizPanel;
    public static JPanel whichQuizToTakePanel;
    public static JPanel quizStudentTakesPanel1;
    public static JPanel quizSubmittedPanel;
    public static JPanel viewGradedQuizPanel;
    public static JPanel editStudentAccountPanel;
    public static JPanel editStudentAccountDonePanel;
    public static JPanel questionForEditQuizPanel;
    public static JPanel deleteQuizPanel;
    public static JPanel quizDeletedPanel;
    public static JPanel viewStudentQuizSubmissionsPanel;
    public static JPanel stuGradedQuizPanel;

    //TEACHER VARIABLES
    public static JButton createTeacherButton;
    public static JButton createStudentButton;
    public static JButton loginTeacherButton;
    public static JButton loginStudentButton;
    public static JButton saveButton;
    public static JLabel createTeacherLabel;
    public static JLabel teacherNameLabel;
    public static JTextField teacherNameText;
    public static JLabel teacherUsernameLabel;
    public static JTextField teacherUsernameText;
    public static JLabel teacherPasswordLabel;
    public static JTextField teacherPasswordText;
    public static JButton createTeacherAccountButton;
    public static JButton createTeacherAccountBackButton;
    public static JLabel teacherAccountCreatedLabel;
    public static JButton teacherLogInButton;
    public static JLabel welcomeTeachersLabel;
    public static JLabel teacherLogInUsernameLabel;
    public static JLabel teacherLogInPasswordLabel;
    public static JTextField teacherLogInUsernameText;
    public static JTextField teacherLogInPasswordText;
    public static JButton teacherLogInBackButton;
    public static JLabel addCourseLabel;
    public static JButton yesCourseButton;
    public static JButton noCourseButton;
    public static JLabel enterCourseNameLabel;
    public static JTextField enterCourseNameText;
    public static JButton createCourseButton;
    public static JButton addCourseBackButton;
    public static JButton createQuizButton;
    public static JButton editQuizButton;
    public static JButton deleteQuizButton;
    public static JButton viewStudentQuizSubmissionsButton;
    public static JButton editTeacherAccountButton;
    public static JButton teacherQuizMenuBackButton;
    public static JLabel nameOfQuizLabel;
    public static JTextField nameOfQuizText;
    public static JLabel formatOfQuizLabel;
    public static JButton formatOfQuiz1Button;
    public static JButton formatOfQuiz2Button;
    public static JButton createQuizBackButton;
    public static JLabel questionOneMCLabel;
    public static JTextField questionOneMCText;
    public static JLabel optionOneMCLabel;
    public static JTextField optionOneMCText;
    public static JLabel optionTwoMCLabel;
    public static JTextField optionTwoMCText;
    public static JLabel optionThreeMCLabel;
    public static JTextField optionThreeMCText;
    public static JLabel optionFourMCLabel;
    public static JTextField optionFourMCText;
    public static JLabel correctAnsChoiceMCLabel;
    public static JTextField correctAnsChoiceMCText;
    public static JLabel pointValueMCLabel;
    public static JTextField pointValueMCText;
    public static JButton addQuestionMCButton;
    public static JButton multipleChoiceQuizBackButton;
    public static JLabel questionOneTFLabel;
    public static JTextField questionOneTFText;
    public static JLabel optionOneTFLabel;
    public static JLabel optionTwoTFLabel;
    public static JLabel correctAnsChoiceTFLabelChoice;
    public static JTextField correctAnsChoiceTFText;
    public static JLabel pointValueTFLabel;
    public static JTextField pointValueTFText;
    public static JButton addQuestionTFButton;
    public static JLabel addAnotherQuestionLabel;
    public static JButton yesAnotherQuestionButton;
    public static JButton noAnotherQuestionButton;
    public static JButton deleteTheQuizButton;
    public static JLabel deleteQuizLabel;
    public static JButton quizDeletedBackButton;
    public static JLabel chooseCourseForViewStuSubmissLabel;
    public static JLabel chooseStudForViewStuSubmissLabel;
    public static JLabel chooseQuizForViewStuSubmissLabel;
    public static JButton viewStudSubmissionsViewButton;
    public static JLabel editTeachAccountLabel;
    public static JLabel editedTeachNameLabel;
    public static JTextField editedTeachNameText;
    public static JLabel editedTeachUsernameLabel;
    public static JTextField editedTeachUsernameText;
    public static JLabel editedTeachPasswordLabel;
    public static JTextField editedTeachPasswordText;
    public static JButton updateTeachAccountButton;
    public static JButton editTeachAccountBackButton;
    public static JButton editAccountDoneBackButton;
    public static JLabel editCourseLabel;
    public static JLabel editQuizLabel;
    public static JLabel editQuestionLabel;
    public static JLabel optionOneEditLabel;
    public static JLabel optionTwoEditLabel;
    public static JLabel optionThreeEditLabel;
    public static JLabel optionFourEditLabel;
    public static JButton saveEditQuizButton;
    public static JTextField editPointValueMCText;
    public static JTextField editCorrectAnsChoiceMCText;
    public static JTextField editOptionOneMCText;
    public static JTextField editOptionTwoMCText;
    public static JTextField editOptionThreeMCText;
    public static JTextField editOptionFourMCText;
    public static JTextField editQuestionOneMCText;
    public static JTextArea showsStuGradedQuizText;


    //STUDENT VARIABLES
    public static JLabel createStudentLabel;
    public static JLabel studentNameLabel;
    public static JTextField studentNameText;
    public static JLabel studentUsernameLabel;
    public static JTextField studentUsernameText;
    public static JLabel studentPasswordLabel;
    public static JTextField studentPasswordText;
    public static JButton createStudentAccountButton;
    public static JButton createStudentAccountBackButton;
    public static JLabel studentAccountCreatedLabel;
    public static JButton studentLogInButton;
    public static JLabel welcomeStudentsLabel;
    public static JLabel studentLogInUsernameLabel;
    public static JTextField studentLogInUsernameText;
    public static JLabel studentLogInPasswordLabel;
    public static JTextField studentLogInPasswordText;
    public static JButton studentLogInBackButton;
    public static JButton takeQuizButton;
    public static JLabel studentChooseCourseLabel;
    public static JLabel chooseCourseTitleLabel;
    public static JButton courseChoosenForQuizNextButton;
    public static JLabel chooseQuizTakeTitleLabel;
    public static JLabel studentChooseQuizLabel;
    public static JButton quizChoosenNextButton;
    public static JLabel questionOneTitleLabel;
    public static JLabel questionOneStuQuizLabel;
    public static JTextField questionOneStuAns;
    public static JLabel typeInAnswerLabel;
    public static JLabel optionOneMC;
    public static JLabel optionTwoMC;
    public static JLabel optionThreeMC;
    public static JLabel optionFourMC;
    public static JButton quizStuTakesNextButton;
    public static JLabel quizSubmittedLabel;
    public static JButton quizDoneBackToStuMenuButton;
    public static JLabel viewGradedQuizTitleLabel;
    public static JButton viewGradedQuizButton;
    public static JLabel whichGradedQuizToViewLabel;
    public static JButton viewQuizButton;
    public static JLabel stuGradedQuizLabel;
    public static JButton stuGradedQuizScreenBackButton;
    public static JButton editStudentAccountButton;
    public static JButton studentLogOutButton;
    public static JLabel editStuAccountLabel;
    public static JLabel editedStuNameLabel;
    public static JTextField editedStuNameText;
    public static JLabel editedStuUsernameLabel;
    public static JTextField editedStuUsernameText;
    public static JLabel editedStuPasswordLabel;
    public static JTextField editedStuPasswordText;
    public static JButton updateStuAccountButton;
    public static JButton editStuAccountBackButton;
    public static JButton nextForEditQuiz;

    //COMMON VARIABLES
    public static JLabel accountUpdatedLabel;
    public static JLabel lsmToolLabel;


    public static void main(String[] args) {

        //mainMenu();
        //createTeacher();
        //accountCreatedTeacher();
        //teacherLogIn();
        //teacherMenu();
        //addCourse();
        //teacherQuizMenu();
        //editStudentAccount();
        //createQuiz();
        //editQuiz();
        //deleteQuiz();
        //viewStudentQuizSubmissions();
        //multipleChoiceQuiz();
        //trueOrFalseQuiz();
        //editTeacherAccount();
        //createStudent();
        //accountCreatedStudent();
        //studentLogIn();
        //studentMenu();
        //chooseCourseForTakeQuiz();
        //whichQuizToTake();
        //quizStudentTakes();
        //viewGradedQuiz();
        showsStuGradedQuiz();
        //editStudentAccount();

    }

    public static void mainMenu() {
        maineMenuFrame = new JFrame();
        maineMenuPanel = new JPanel();
        maineMenuFrame.setSize(400, 300);
        maineMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        maineMenuFrame.add(maineMenuPanel);

        lsmToolLabel = new JLabel("Welcome to Learning System Management Tool!");
        lsmToolLabel.setBounds(50, 20, 500, 25);
        maineMenuPanel.add(lsmToolLabel);

        createTeacherButton = new JButton("Create Teacher");
        createTeacherButton.setBounds(120, 50, 150, 25);
        createTeacherButton.addActionListener(new Main());
        maineMenuPanel.add(createTeacherButton);

        createTeacherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maineMenuFrame.setVisible(false);
                maineMenuFrame.dispose();
                createTeacher();
            }
        });

        createStudentButton = new JButton("Create Student");
        createStudentButton.setBounds(120, 80, 150, 25);
        createStudentButton.addActionListener(new Main());
        maineMenuPanel.add(createStudentButton);


        createStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maineMenuFrame.setVisible(false);
                maineMenuFrame.dispose();
                createStudent();
            }
        });

        loginTeacherButton = new JButton("Login Teacher");
        loginTeacherButton.setBounds(120, 110, 150, 25);
        loginTeacherButton.addActionListener(new Main());
        maineMenuPanel.add(loginTeacherButton);

        loginTeacherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maineMenuFrame.setVisible(false);
                maineMenuFrame.dispose();
                teacherLogIn();
            }
        });

        loginStudentButton = new JButton("Login Student");
        loginStudentButton.setBounds(120, 140, 150, 25);
        loginStudentButton.addActionListener(new Main());
        maineMenuPanel.add(loginStudentButton);

        loginStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maineMenuFrame.setVisible(false);
                maineMenuFrame.dispose();
                studentLogIn();
            }
        });

        saveButton = new JButton("Save and Exit");
        saveButton.setBounds(120, 170, 150, 25);
        saveButton.addActionListener(new Main());
        maineMenuPanel.add(saveButton);
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call the save data methods
            }
        });


        maineMenuPanel.setLayout(null);

        maineMenuFrame.setVisible(true);

    }



    public static void createTeacher() {
        createTeacherFrame = new JFrame();
        createTeacherPanel = new JPanel();
        createTeacherFrame.setSize(400, 300);
        createTeacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createTeacherFrame.add(createTeacherPanel);

        createTeacherPanel.setLayout(null);

        createTeacherLabel = new JLabel("Create a teacher account");
        createTeacherLabel.setBounds(120, 20, 200, 25);
        createTeacherPanel.add(createTeacherLabel);

        teacherNameLabel = new JLabel("First & Last Name:");
        teacherNameLabel.setBounds(20, 50, 150, 25);
        createTeacherPanel.add(teacherNameLabel);

        teacherNameText = new JTextField(20);
        teacherNameText.setBounds(150, 50, 165, 25);
        createTeacherPanel.add(teacherNameText);

        teacherUsernameLabel = new JLabel("Username:");
        teacherUsernameLabel.setBounds(20, 80, 80, 25);
        createTeacherPanel.add(teacherUsernameLabel);

        teacherUsernameText = new JTextField(20);
        teacherUsernameText.setBounds(150, 80, 165, 25);
        createTeacherPanel.add(teacherUsernameText);

        teacherPasswordLabel = new JLabel("Password:");
        teacherPasswordLabel.setBounds(20, 110, 80, 25);
        createTeacherPanel.add(teacherPasswordLabel);

        teacherPasswordText = new JTextField(20);
        teacherPasswordText.setBounds(150, 110, 165, 25);
        createTeacherPanel.add(teacherPasswordText);

        createTeacherAccountButton = new JButton("Create Account");
        createTeacherAccountButton.setBounds(160, 150, 150, 25);
        createTeacherAccountButton.addActionListener(new Main());
        createTeacherPanel.add(createTeacherAccountButton);
        JLabel invalidName = new JLabel();
        createTeacherAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String returnValue = checkSpaceForTeacherName(teacherNameText);
                if(returnValue.equals("Success")) {
                    createTeacherFrame.setVisible(false);
                    createTeacherFrame.dispose();
                    accountCreatedTeacher();
                }
                else {
                    invalidName.setText(returnValue);
                    invalidName.setBounds(30, 180, 250, 20);
                    createTeacherPanel.add(invalidName);
                    createTeacherPanel.repaint();
                }
            }
        });

        createTeacherAccountBackButton = new JButton("Back");
        createTeacherAccountBackButton.setBounds(30, 150, 110, 25);
        createTeacherAccountBackButton.addActionListener(new Main());
        createTeacherPanel.add(createTeacherAccountBackButton);

        createTeacherAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
            }
        });

        createTeacherFrame.setVisible(true);

    }

// Sample invalid input check

    public static String checkSpaceForTeacherName(JTextField teacherNameText) {
        try {
            if(teacherNameText.getText().contains(" ") )
                return "Success";
            else
                return "Enter a space for first and last name";
        } catch (NumberFormatException e) {
            return "Something went wrong Please re-enter all fields!!";
        }
    }


    public static void accountCreatedTeacher() {
        accountCreatedTeacherFrame = new JFrame();
        createTeacherPanel = new JPanel();
        accountCreatedTeacherFrame.setSize(400, 300);
        accountCreatedTeacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountCreatedTeacherFrame.add(createTeacherPanel);
        createTeacherPanel.setLayout(null);

        teacherAccountCreatedLabel = new JLabel("Account successfully created!");
        teacherAccountCreatedLabel.setBounds(110, 20, 200, 25);
        createTeacherPanel.add(teacherAccountCreatedLabel);

        teacherLogInButton = new JButton("Log In");
        teacherLogInButton.setBounds(150, 70, 90, 25);
        teacherLogInButton.addActionListener(new Main());
        createTeacherPanel.add(teacherLogInButton);

        teacherLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherLogIn();
            }
        });

        createTeacherPanel.setLayout(null);

        accountCreatedTeacherFrame.setVisible(true);

    }

    public static void teacherLogIn() {
        teacherLogInFrame = new JFrame();
        teacherLogInPanel = new JPanel();
        teacherLogInFrame.setSize(400, 300);
        teacherLogInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherLogInFrame.add(teacherLogInPanel);

        teacherLogInPanel.setLayout(null);

        welcomeTeachersLabel = new JLabel("Welcome teachers!");
        welcomeTeachersLabel.setBounds(140, 20, 150, 25);
        teacherLogInPanel.add(welcomeTeachersLabel);

        teacherLogInUsernameLabel = new JLabel("Username:");
        teacherLogInUsernameLabel.setBounds(20, 50, 80, 25);
        teacherLogInPanel.add(teacherLogInUsernameLabel);

        teacherLogInPasswordLabel = new JLabel("Password:");
        teacherLogInPasswordLabel.setBounds(20, 80, 80, 25);
        teacherLogInPanel.add(teacherLogInPasswordLabel);

        teacherLogInUsernameText = new JTextField(20);
        teacherLogInUsernameText.setBounds(100, 50, 165, 25);
        teacherLogInPanel.add(teacherLogInUsernameText);

        teacherLogInPasswordText = new JTextField(20);
        teacherLogInPasswordText.setBounds(100, 80, 165, 25);
        teacherLogInPanel.add(teacherLogInPasswordText);

        teacherLogInButton = new JButton("Login");
        teacherLogInButton.setBounds(150, 120, 80, 25);
        teacherLogInButton.addActionListener(new Main());
        teacherLogInPanel.add(teacherLogInButton);

        teacherLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherLogInFrame.setVisible(false);
                teacherLogInFrame.dispose();
                teacherCourseMenu();
            }
        });

        teacherLogInBackButton = new JButton("Back");
        teacherLogInBackButton.setBounds(30, 120, 110, 25);
        teacherLogInBackButton.addActionListener(new Main());
        teacherLogInPanel.add(teacherLogInBackButton);

        teacherLogInBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
            }
        });

        teacherLogInFrame.setVisible(true);
    }

    public static void teacherCourseMenu() {
        teacherMenuFrame = new JFrame();
        teacherMenuPanel = new JPanel();
        teacherMenuFrame.setSize(400, 300);
        teacherMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherMenuFrame.add(teacherMenuPanel);

        addCourseLabel = new JLabel("Do you want to add a course?");
        addCourseLabel.setBounds(80, 20, 200, 25);
        teacherMenuPanel.add(addCourseLabel);

        yesCourseButton = new JButton("Yes");
        yesCourseButton.setBounds(120, 50, 80, 25);
        yesCourseButton.addActionListener(new Main());
        teacherMenuPanel.add(yesCourseButton);

        yesCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherMenuFrame.setVisible(false);
                teacherMenuFrame.dispose();
                addCourse();
            }
        });

        noCourseButton = new JButton("No");
        noCourseButton.setBounds(120, 80, 80, 25);
        noCourseButton.addActionListener(new Main());
        teacherMenuPanel.add(noCourseButton);

        //if teacher doesn't want to create a course
        noCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
            }
        });


        teacherMenuPanel.setLayout(null);
        teacherMenuFrame.setVisible(true);

    }

    public static void addCourse() {

        addCourseFrame = new JFrame();
        addCoursePanel = new JPanel();
        addCourseFrame.setSize(400, 300);
        addCourseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addCourseFrame.add(addCoursePanel);

        // if yes to adding a course
        // PATHWAY IS

        enterCourseNameLabel = new JLabel("Enter Course Name:");
        enterCourseNameLabel.setBounds(130, 20, 200, 25);
        addCoursePanel.add(enterCourseNameLabel);

        enterCourseNameText = new JTextField(50);
        enterCourseNameText.setBounds(120, 50, 165, 25);
        addCoursePanel.add(enterCourseNameText);

        createCourseButton = new JButton("Create Course");
        createCourseButton.setBounds(180, 80, 140, 25);
        createCourseButton.addActionListener(new Main());
        addCoursePanel.add(createCourseButton);

        createCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourseFrame.setVisible(false);
                addCourseFrame.dispose();
                teacherQuizMenu();
            }
        });

        addCourseBackButton = new JButton("Back");
        addCourseBackButton.setBounds(60, 80, 80, 25);
        addCourseBackButton.addActionListener(new Main());
        addCoursePanel.add(addCourseBackButton);

        addCourseBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourseFrame.setVisible(false);
                addCourseFrame.dispose();
                teacherCourseMenu();
            }
        });

        addCoursePanel.setLayout(null);
        addCourseFrame.setVisible(true);
    }

    public static void teacherQuizMenu() {
        teacherQuizMenuFrame = new JFrame();
        teacherQuizMenuPanel = new JPanel();
        teacherQuizMenuFrame.setSize(400, 300);
        teacherQuizMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherQuizMenuFrame.add(teacherQuizMenuPanel);

        lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        teacherQuizMenuPanel.add(lsmToolLabel);

        createQuizButton = new JButton("Create a Quiz");
        createQuizButton.setBounds(80, 50, 250, 25);
        createQuizButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(createQuizButton);

        createQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                createQuiz();
            }
        });

        editQuizButton = new JButton("Edit Quiz");
        editQuizButton.setBounds(80, 80, 250, 25);
        editQuizButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(editQuizButton);

        editQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                editQuiz();
            }
        });

        deleteQuizButton = new JButton("Delete Quiz");
        deleteQuizButton.setBounds(80, 110, 250, 25);
        deleteQuizButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(deleteQuizButton);

        deleteQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                deleteQuiz();
            }
        });


        viewStudentQuizSubmissionsButton = new JButton("View Student Quiz Submissions");
        viewStudentQuizSubmissionsButton.setBounds(80, 140, 250, 25);
        viewStudentQuizSubmissionsButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(viewStudentQuizSubmissionsButton);

        viewStudentQuizSubmissionsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                viewStudentQuizSubmissions();
            }
        });

        editTeacherAccountButton = new JButton("Edit Account");
        editTeacherAccountButton.setBounds(80, 170, 250, 25);
        editTeacherAccountButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(editTeacherAccountButton);

        editTeacherAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                editTeacherAccount();
            }
        });


        teacherQuizMenuBackButton = new JButton("Back");
        teacherQuizMenuBackButton.setBounds(30, 200, 110, 25);
        teacherQuizMenuBackButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(teacherQuizMenuBackButton);

        teacherQuizMenuBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                addCourse();
            }
        });

        teacherQuizMenuPanel.setLayout(null);
        teacherQuizMenuFrame.setVisible(true);
    }
    public static int qno = 1;
    public static void createQuiz() {
        createQuizFrame = new JFrame();
        createQuizPanel = new JPanel();
        createQuizFrame.setSize(400, 300);
        createQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createQuizFrame.add(createQuizPanel);

        lsmToolLabel = new JLabel("Create a Quiz");
        lsmToolLabel.setBounds(130, 20, 500, 25);
        createQuizPanel.add(lsmToolLabel);

        nameOfQuizLabel = new JLabel("Name of Quiz:");
        nameOfQuizLabel.setBounds(20, 50, 150, 25);
        createQuizPanel.add(nameOfQuizLabel);

        nameOfQuizText = new JTextField(20);
        nameOfQuizText.setBounds(120, 50, 125, 25);
        createQuizPanel.add(nameOfQuizText);

        formatOfQuizLabel = new JLabel("Format of Quiz:");
        formatOfQuizLabel.setBounds(20, 90, 150, 25);
        createQuizPanel.add(formatOfQuizLabel);

        formatOfQuiz1Button = new JButton("Multiple-Choice");
        formatOfQuiz1Button.setBounds(80, 130, 190, 25);
        formatOfQuiz1Button.addActionListener(new Main());
        createQuizPanel.add(formatOfQuiz1Button);

        formatOfQuiz1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuizFrame.setVisible(false);
                createQuizFrame.dispose();
                multipleChoiceQuiz();
            }
        });

        formatOfQuiz2Button = new JButton("True/False");
        formatOfQuiz2Button.setBounds(80, 160, 190, 25);
        formatOfQuiz2Button.addActionListener(new Main());
        createQuizPanel.add(formatOfQuiz2Button);

        formatOfQuiz2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuizFrame.setVisible(false);
                createQuizFrame.dispose();
                trueOrFalseQuiz();
            }
        });

        createQuizBackButton = new JButton("Back");
        createQuizBackButton.setBounds(30, 190, 110, 25);
        createQuizBackButton.addActionListener(new Main());
        createQuizPanel.add(createQuizBackButton);

        createQuizBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuizFrame.setVisible(false);
                createQuizFrame.dispose();
                teacherQuizMenu();
            }
        });

        createQuizPanel.setLayout(null);
        createQuizFrame.setVisible(true);
    }

    public static void multipleChoiceQuiz() {
        multipleChoiceQuizFrame = new JFrame();
        multipleChoiceQuizPanel = new JPanel();
        multipleChoiceQuizFrame.setSize(400, 320);
        multipleChoiceQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleChoiceQuizFrame.add(multipleChoiceQuizPanel);

        lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        multipleChoiceQuizPanel.add(lsmToolLabel);

        questionOneMCLabel = new JLabel("Type in Question "+qno+" : ");
        questionOneMCLabel.setBounds(20, 50, 160, 25);
        multipleChoiceQuizPanel.add(questionOneMCLabel);

        questionOneMCText = new JTextField(20);
        questionOneMCText.setBounds(210, 50, 165, 25);
        multipleChoiceQuizPanel.add(questionOneMCText);

        optionOneMCLabel = new JLabel("Option 1:");
        optionOneMCLabel.setBounds(20, 80, 80, 25);
        multipleChoiceQuizPanel.add(optionOneMCLabel);

        optionOneMCText = new JTextField(20);
        optionOneMCText.setBounds(210, 80, 165, 25);
        multipleChoiceQuizPanel.add(optionOneMCText);

        optionTwoMCLabel = new JLabel("Option 2:");
        optionTwoMCLabel.setBounds(20, 110, 80, 25);
        multipleChoiceQuizPanel.add(optionTwoMCLabel);

        optionTwoMCText = new JTextField(20);
        optionTwoMCText.setBounds(210, 110, 165, 25);
        multipleChoiceQuizPanel.add(optionTwoMCText);

        optionThreeMCLabel = new JLabel("Option 3:");
        optionThreeMCLabel.setBounds(20, 140, 80, 25);
        multipleChoiceQuizPanel.add(optionThreeMCLabel);

        optionThreeMCText = new JTextField(20);
        optionThreeMCText.setBounds(210, 140, 165, 25);
        multipleChoiceQuizPanel.add(optionThreeMCText);

        optionFourMCLabel = new JLabel("Option 4:");
        optionFourMCLabel.setBounds(20, 170, 80, 25);
        multipleChoiceQuizPanel.add(optionFourMCLabel);

        optionFourMCText = new JTextField(20);
        optionFourMCText.setBounds(210, 170, 165, 25);
        multipleChoiceQuizPanel.add(optionFourMCText);

        correctAnsChoiceMCLabel = new JLabel("Enter correct answer choice:");
        correctAnsChoiceMCLabel.setBounds(20, 200, 250, 25);
        multipleChoiceQuizPanel.add(correctAnsChoiceMCLabel);

        correctAnsChoiceMCText = new JTextField(20);
        correctAnsChoiceMCText.setBounds(210, 200, 165, 25);
        multipleChoiceQuizPanel.add(correctAnsChoiceMCText);

        pointValueMCLabel = new JLabel("Enter the point value:");
        pointValueMCLabel.setBounds(20, 230, 250, 25);
        multipleChoiceQuizPanel.add(pointValueMCLabel);

        pointValueMCText = new JTextField(20);
        pointValueMCText.setBounds(210, 230, 165, 25);
        multipleChoiceQuizPanel.add(pointValueMCText);

        //adds the questions
        addQuestionMCButton = new JButton("Add Question");
        addQuestionMCButton.setBounds(210, 260, 150, 25);
        addQuestionMCButton.addActionListener(new Main());
        multipleChoiceQuizPanel.add(addQuestionMCButton);

        // once the add question button is clicked, we need to add the question to the list of questions for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not

        addQuestionMCButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multipleChoiceQuizFrame.setVisible(false);
                multipleChoiceQuizFrame.dispose();
                addAnotherQuestion(0);
            }
        });

        multipleChoiceQuizBackButton = new JButton("Back");
        multipleChoiceQuizBackButton.setBounds(30, 290, 110, 25);
        multipleChoiceQuizBackButton.addActionListener(new Main());
        multipleChoiceQuizPanel.add(multipleChoiceQuizBackButton);

        multipleChoiceQuizBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multipleChoiceQuizFrame.setVisible(false);
                multipleChoiceQuizFrame.dispose();
                createQuiz();
            }
        });

        multipleChoiceQuizPanel.setLayout(null);
        multipleChoiceQuizFrame.setVisible(true);
    }

    public static void trueOrFalseQuiz() {
        trueOrFalseQuizFrame = new JFrame();
        trueOrFalseQuizPanel = new JPanel();
        trueOrFalseQuizFrame.setSize(400, 320);
        trueOrFalseQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        trueOrFalseQuizFrame.add(trueOrFalseQuizPanel);

        lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        trueOrFalseQuizPanel.add(lsmToolLabel);

        questionOneTFLabel = new JLabel("Type in Question "+qno+" : ");
        questionOneTFLabel.setBounds(20, 50, 160, 25);
        trueOrFalseQuizPanel.add(questionOneTFLabel);

        questionOneTFText = new JTextField(20);
        questionOneTFText.setBounds(210, 50, 165, 25);
        trueOrFalseQuizPanel.add(questionOneTFText);

        optionOneTFLabel = new JLabel("1) True");
        optionOneTFLabel.setBounds(20, 80, 80, 25);
        trueOrFalseQuizPanel.add(optionOneTFLabel);

        optionTwoTFLabel = new JLabel("2) False");
        optionTwoTFLabel.setBounds(20, 110, 80, 25);
        trueOrFalseQuizPanel.add(optionTwoTFLabel);

        correctAnsChoiceTFLabelChoice = new JLabel("Enter correct answer choice (True or False):");
        correctAnsChoiceTFLabelChoice.setBounds(20, 140, 320, 25);
        trueOrFalseQuizPanel.add(correctAnsChoiceTFLabelChoice);

        correctAnsChoiceTFText = new JTextField(20);
        correctAnsChoiceTFText.setBounds(300, 140, 90, 25);
        trueOrFalseQuizPanel.add(correctAnsChoiceTFText);

        pointValueTFLabel = new JLabel("Enter the point value:");
        pointValueTFLabel.setBounds(20, 170, 250, 25);
        trueOrFalseQuizPanel.add(pointValueTFLabel);

        pointValueTFText = new JTextField(20);
        pointValueTFText.setBounds(300, 170, 90, 25);
        trueOrFalseQuizPanel.add(pointValueTFText);

        //adds the questions
        addQuestionTFButton = new JButton("Add Question");
        addQuestionTFButton.setBounds(120, 210, 150, 25);
        addQuestionTFButton.addActionListener(new Main());
        trueOrFalseQuizPanel.add(addQuestionTFButton);

        // once the add question button is clicked, we need to add the question to the list of questions for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not

        addQuestionTFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trueOrFalseQuizFrame.setVisible(false);
                trueOrFalseQuizFrame.dispose();
                addAnotherQuestion(1);
            }
        });

        trueOrFalseQuizPanel.setLayout(null);
        trueOrFalseQuizFrame.setVisible(true);

    }

    public static void addAnotherQuestion(int type) {
        addAnotherQuestionFrame = new JFrame();
        addAnotherQuestionPanel = new JPanel();
        addAnotherQuestionFrame.setSize(400, 300);
        addAnotherQuestionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addAnotherQuestionFrame.add(addAnotherQuestionPanel);

        addAnotherQuestionLabel = new JLabel("Do you want to add another question?");
        addAnotherQuestionLabel.setBounds(70, 20, 280, 25);
        addAnotherQuestionPanel.add(addAnotherQuestionLabel);

        yesAnotherQuestionButton = new JButton("Yes");
        yesAnotherQuestionButton.setBounds(110, 50, 80, 25);
        yesAnotherQuestionButton.addActionListener(new Main());
        addAnotherQuestionPanel.add(yesAnotherQuestionButton);

        //if the user wants to add another question, display the screen of the question, options, correct answer and point value again
        //this time however, it should say type in question 2
        //call whichever type of quiz based on the format of the quiz

        yesAnotherQuestionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(type == 0) {
                    qno++;
                    multipleChoiceQuiz();
                }
                else {
                    qno++;
                    trueOrFalseQuiz();
                }
            }
        });

        // if the user doesn't want to add another question
        noAnotherQuestionButton = new JButton("No");
        noAnotherQuestionButton.setBounds(200, 50, 80, 25);
        noAnotherQuestionButton.addActionListener(new Main());
        addAnotherQuestionPanel.add(noAnotherQuestionButton);

        // save the quiz if the user doesn't want to add another question

        noAnotherQuestionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherCourseMenu();
            }
        });

        addAnotherQuestionPanel.setLayout(null);
        addAnotherQuestionFrame.setVisible(true);

    }

    public static void editQuiz() {
        editQuizFrame = new JFrame();
        editQuizPanel = new JPanel();
        editQuizFrame.setSize(400, 300);
        editQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editQuizFrame.add(editQuizPanel);

        lsmToolLabel = new JLabel("Edit a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        editQuizPanel.add(lsmToolLabel);

        /// CHOOSE COURSE
        editCourseLabel = new JLabel("Which course would you like to edit a quiz from?");
        editCourseLabel.setBounds(30, 50, 700, 25);
        editQuizPanel.add(editCourseLabel);

        //below array needs to contain the list of courses that have bene created so far
        String[] coursesToEditQuiz = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> coursesList = new JComboBox<>(coursesToEditQuiz);
        coursesList.setBounds(120, 70, 140, 20);
        editQuizPanel.add(coursesList);

        //CHOOSE QUIZ
        editQuizLabel = new JLabel("Which quiz would you like to edit?");
        editQuizLabel.setBounds(30, 100, 700, 25);
        editQuizPanel.add(editQuizLabel);

        //below array needs to contain the list of courses that have bene created so far
        String[] editQuizFromList = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> editQuizList = new JComboBox<>(editQuizFromList);
        editQuizList.setBounds(120, 130, 140, 20);
        editQuizPanel.add(editQuizList);

        //CHOOSE QUESTION
        editQuestionLabel = new JLabel("Which question would you like to edit?");
        editQuestionLabel.setBounds(30, 150, 700, 25);
        editQuizPanel.add(editQuestionLabel);

        //below array needs to contain the list of courses that have bene created so far
        String[] editQuestionFromList = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> editQuestionList = new JComboBox<>(editQuestionFromList);
        editQuestionList.setBounds(120, 180, 140, 20);
        editQuizPanel.add(editQuestionList);


        //next screen button
        nextForEditQuiz = new JButton("Next");
        nextForEditQuiz.setBounds(120, 220, 110, 25);
        nextForEditQuiz.addActionListener(new Main());
        editQuizPanel.add(nextForEditQuiz);

        nextForEditQuiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editQuizFrame.setVisible(false);
                editQuizFrame.dispose();
                questionForEditQuiz(); // this brings the question to the next screen
                // (where they can edit the questions)
            }
        });

        editQuizPanel.setLayout(null);
        editQuizFrame.setVisible(true);

    }

    //question screen that teacher can edit from
    public static void questionForEditQuiz() {

        //if multiple choice
        questionForEditQuizFrame = new JFrame();
        questionForEditQuizPanel = new JPanel();
        questionForEditQuizFrame.setSize(400, 320);
        questionForEditQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questionForEditQuizFrame.add(questionForEditQuizPanel);

        lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        questionForEditQuizPanel.add(lsmToolLabel);

        questionOneMCLabel = new JLabel("Type in Question : ");
        questionOneMCLabel.setBounds(20, 50, 160, 25);
        questionForEditQuizPanel.add(questionOneMCLabel);


        editQuestionOneMCText = new JTextField(20);
        editQuestionOneMCText.setBounds(210, 50, 165, 25);
        questionForEditQuizPanel.add(editQuestionOneMCText);

        optionOneEditLabel = new JLabel("Option 1:");
        optionOneEditLabel.setBounds(20, 80, 80, 25);
        questionForEditQuizPanel.add(optionOneEditLabel);


        editOptionOneMCText = new JTextField(20);
        editOptionOneMCText.setBounds(210, 80, 165, 25);
        questionForEditQuizPanel.add(editOptionOneMCText);

        optionTwoEditLabel = new JLabel("Option 2:");
        optionTwoEditLabel.setBounds(20, 110, 80, 25);
        questionForEditQuizPanel.add(optionTwoEditLabel);


        editOptionTwoMCText = new JTextField(20);
        editOptionTwoMCText.setBounds(210, 110, 165, 25);
        questionForEditQuizPanel.add(editOptionTwoMCText);

        optionThreeEditLabel = new JLabel("Option 3:");
        optionThreeEditLabel.setBounds(20, 140, 80, 25);
        questionForEditQuizPanel.add(optionThreeEditLabel);


        editOptionThreeMCText = new JTextField(20);
        editOptionThreeMCText.setBounds(210, 140, 165, 25);
        questionForEditQuizPanel.add(editOptionThreeMCText);

        optionFourEditLabel = new JLabel("Option 4:");
        optionFourEditLabel.setBounds(20, 170, 80, 25);
        questionForEditQuizPanel.add(optionFourEditLabel);


        editOptionFourMCText = new JTextField(20);
        editOptionFourMCText.setBounds(210, 170, 165, 25);
        questionForEditQuizPanel.add(editOptionFourMCText);

        correctAnsChoiceMCLabel = new JLabel("Enter correct answer choice:");
        correctAnsChoiceMCLabel.setBounds(20, 200, 250, 25);
        questionForEditQuizPanel.add(correctAnsChoiceMCLabel);


        editCorrectAnsChoiceMCText = new JTextField(20);
        editCorrectAnsChoiceMCText.setBounds(210, 200, 165, 25);
        questionForEditQuizPanel.add(editCorrectAnsChoiceMCText);

        pointValueMCLabel = new JLabel("Enter the point value:");
        pointValueMCLabel.setBounds(20, 230, 250, 25);
        questionForEditQuizPanel.add(pointValueMCLabel);


        editPointValueMCText = new JTextField(20);
        editPointValueMCText.setBounds(210, 230, 165, 25);
        questionForEditQuizPanel.add(editPointValueMCText);

        //saves question
        saveEditQuizButton = new JButton("Save and Update Quiz");
        saveEditQuizButton.setBounds(210, 260, 150, 25);
        saveEditQuizButton.addActionListener(new Main());
        questionForEditQuizPanel.add(saveEditQuizButton);

        // once the add question button is clicked, we need to add the question to the list of questions for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not

        saveEditQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                questionForEditQuizFrame.setVisible(false);
                questionForEditQuizFrame.dispose();
                teacherCourseMenu();
            }
        });

        //

        questionForEditQuizPanel.setLayout(null);
        questionForEditQuizFrame.setVisible(true);
    }


    //delete quiz gui
    public static void deleteQuiz(){
        deleteQuizFrame = new JFrame();
        deleteQuizPanel = new JPanel();
        deleteQuizFrame.setSize(400, 300);
        deleteQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        deleteQuizFrame.add(deleteQuizPanel);

        lsmToolLabel = new JLabel("Delete a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        deleteQuizPanel.add(lsmToolLabel);

        /// CHOOSE COURSE
        deleteQuizLabel = new JLabel("Which quiz would you like to delete?");
        deleteQuizLabel.setBounds(30, 50, 700, 25);
        deleteQuizPanel.add(deleteQuizLabel);

        //below array needs to contain the list of quizzes that have been created
        String[] listOfQuizzes = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> quizzesList = new JComboBox<>(listOfQuizzes);
        quizzesList.setBounds(120, 80, 140, 20);
        deleteQuizPanel.add(quizzesList);


        deleteTheQuizButton = new JButton("Delete");
        deleteTheQuizButton.setBounds(230, 130, 110, 25);
        deleteTheQuizButton.addActionListener(new Main());
        deleteQuizPanel.add(deleteTheQuizButton);

        deleteTheQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteQuizFrame.setVisible(false);
                deleteQuizFrame.dispose();
                quizDeleted(); // this brings the question to the next screen
                // (where they can edit the questions)
            }
        });

        deleteQuizPanel.setLayout(null);
        deleteQuizFrame.setVisible(true);
    }


    public static void quizDeleted(){
        quizDeletedFrame = new JFrame();
        quizDeletedPanel = new JPanel();
        quizDeletedFrame.setSize(400, 300);
        quizDeletedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizDeletedFrame.add(quizDeletedPanel);

        deleteQuizLabel = new JLabel("Quiz has been deleted!");
        deleteQuizLabel.setBounds(120, 50, 700, 25);
        quizDeletedPanel.add(deleteQuizLabel);

        quizDeletedBackButton = new JButton("Return to Homepage");
        quizDeletedBackButton.setBounds(100, 100, 190, 25);
        quizDeletedBackButton.addActionListener(new Main());
        quizDeletedPanel.add(quizDeletedBackButton);

        quizDeletedBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizDeletedFrame.setVisible(false);
                quizDeletedFrame.dispose();
                teacherQuizMenu(); // this brings the question to the next screen
                // (where they can edit the questions)
            }
        });

        quizDeletedPanel.setLayout(null);
        quizDeletedFrame.setVisible(true);
    }

    // viewStudentQuizSubmission GUI
    public static void viewStudentQuizSubmissions(){
        viewStudentQuizSubmissionsFrame = new JFrame();
        viewStudentQuizSubmissionsPanel = new JPanel();
        viewStudentQuizSubmissionsFrame.setSize(400, 300);
        viewStudentQuizSubmissionsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewStudentQuizSubmissionsFrame.add(viewStudentQuizSubmissionsPanel);

        lsmToolLabel = new JLabel("View Student Quiz Submissions");
        lsmToolLabel.setBounds(100, 20, 500, 25);
        viewStudentQuizSubmissionsPanel.add(lsmToolLabel);

        chooseCourseForViewStuSubmissLabel = new JLabel("Choose the course you would like to view quiz submissions for:");
        chooseCourseForViewStuSubmissLabel.setBounds(20, 50, 700, 25);
        viewStudentQuizSubmissionsPanel.add(chooseCourseForViewStuSubmissLabel);

        //below array needs to contain the list of courses that have been created
        String[] listOfCourses = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> coursesList = new JComboBox<>(listOfCourses);
        coursesList.setBounds(120, 80, 140, 20);
        viewStudentQuizSubmissionsPanel.add(coursesList);

        chooseStudForViewStuSubmissLabel = new JLabel("Choose student to view their quizzes:");
        chooseStudForViewStuSubmissLabel.setBounds(20, 110, 700, 25);
        viewStudentQuizSubmissionsPanel.add(chooseStudForViewStuSubmissLabel);

        //below array needs to contain the list of students that are there
        String[] listOfStudents = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> studentsList = new JComboBox<>(listOfStudents);
        studentsList.setBounds(120, 140, 140, 20);
        viewStudentQuizSubmissionsPanel.add(studentsList);


        chooseQuizForViewStuSubmissLabel = new JLabel("Which quiz do you want to view?");
        chooseQuizForViewStuSubmissLabel.setBounds(20, 170, 700, 25);
        viewStudentQuizSubmissionsPanel.add(chooseQuizForViewStuSubmissLabel);

        //below array needs to contain the list of quizzes that have been created
        String[] listOfQuizzes = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> quizzesList = new JComboBox<>(listOfQuizzes);
        quizzesList.setBounds(120, 200, 140, 20);
        viewStudentQuizSubmissionsPanel.add(quizzesList);


        viewStudSubmissionsViewButton = new JButton("View");
        viewStudSubmissionsViewButton.setBounds(260, 230, 110, 25);
        viewStudSubmissionsViewButton.addActionListener(new Main());
        viewStudentQuizSubmissionsPanel.add(viewStudSubmissionsViewButton);

        viewStudSubmissionsViewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewStudentQuizSubmissionsFrame.setVisible(false);
                viewStudentQuizSubmissionsFrame.dispose();
                //call a method here which will then allow the teacher to view the student's quiz after they click the above button

            }
        });

        viewStudentQuizSubmissionsPanel.setLayout(null);
        viewStudentQuizSubmissionsFrame .setVisible(true);
    }



    public static void editTeacherAccount() {
        editTeacherAccountFrame = new JFrame();
        editTeacherAccountPanel = new JPanel();
        editTeacherAccountFrame.setSize(400, 300);
        editTeacherAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editTeacherAccountFrame.add(editTeacherAccountPanel);

        editTeacherAccountPanel.setLayout(null);

        editTeachAccountLabel = new JLabel("Edit Teacher Account");
        editTeachAccountLabel.setBounds(80, 20, 200, 25);
        editTeacherAccountPanel.add(editTeachAccountLabel);

        editedTeachNameLabel = new JLabel("First & Last Name:");
        editedTeachNameLabel.setBounds(20, 50, 150, 25);
        editTeacherAccountPanel.add(editedTeachNameLabel);

        editedTeachNameText = new JTextField(20);
        editedTeachNameText.setBounds(150, 50, 165, 25);
        editTeacherAccountPanel.add(editedTeachNameText);

        editedTeachUsernameLabel = new JLabel("Username:");
        editedTeachUsernameLabel.setBounds(20, 80, 80, 25);
        editTeacherAccountPanel.add(editedTeachUsernameLabel);

        editedTeachUsernameText = new JTextField(20);
        editedTeachUsernameText.setBounds(150, 80, 165, 25);
        editTeacherAccountPanel.add(editedTeachUsernameText);

        editedTeachPasswordLabel = new JLabel("Password:");
        editedTeachPasswordLabel.setBounds(20, 110, 80, 25);
        editTeacherAccountPanel.add(editedTeachPasswordLabel);

        editedTeachPasswordText = new JTextField(20);
        editedTeachPasswordText.setBounds(150, 110, 165, 25);
        editTeacherAccountPanel.add(editedTeachPasswordText);

        updateTeachAccountButton = new JButton("Save and Update Account");
        updateTeachAccountButton.setBounds(30, 150, 200, 25);
        updateTeachAccountButton.addActionListener(new Main());
        editTeacherAccountPanel.add(updateTeachAccountButton);

        //what should happen when the student save and updates their information (call the specific method that saves the updated data)

        updateTeachAccountButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                editTeacherAccountFrame.setVisible(false);
                editTeacherAccountFrame.dispose();
                editTeachAccountDone();

            }
        });


        editTeachAccountBackButton = new JButton("Back");
        editTeachAccountBackButton.setBounds(30, 180, 110, 25);
        editTeachAccountBackButton.addActionListener(new Main());
        editTeacherAccountPanel.add(editTeachAccountBackButton);

        editTeachAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editTeacherAccountFrame.setVisible(false);
                editTeacherAccountFrame.dispose();
                studentMenu();
            }
        });


        editTeacherAccountFrame.setVisible(true);

    }

    public static void editTeachAccountDone(){
        editTeachAccountDoneFrame = new JFrame();
        editTeachAccountDonePanel = new JPanel();
        editTeachAccountDoneFrame.setSize(400, 300);
        editTeachAccountDoneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editTeachAccountDoneFrame.add(editTeachAccountDonePanel);

        editTeachAccountDonePanel.setLayout(null);

        accountUpdatedLabel = new JLabel("Account updated!");
        accountUpdatedLabel.setBounds(140, 30, 280, 25);
        editTeachAccountDonePanel.add(accountUpdatedLabel);

        editAccountDoneBackButton = new JButton("Back");
        editAccountDoneBackButton.setBounds(140, 60, 110, 25);
        editAccountDoneBackButton.addActionListener(new Main());
        editTeachAccountDonePanel.add(editAccountDoneBackButton);

        editAccountDoneBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editTeachAccountDoneFrame.setVisible(false);
                editTeachAccountDoneFrame.dispose();
                mainMenu();
            }
        });


        editTeachAccountDoneFrame.setVisible(true);

    }

    //Teacher Pathway ends

    //Student pathway starts
    public static void createStudent() {
        createStudentFrame = new JFrame();
        createStudentPanel = new JPanel();
        createStudentFrame.setSize(400, 300);
        createStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createStudentFrame.add(createStudentPanel);

        createStudentPanel.setLayout(null);

        createStudentLabel = new JLabel("Create a student account");
        createStudentLabel.setBounds(80, 20, 200, 25);
        createStudentPanel.add(createStudentLabel);

        studentNameLabel = new JLabel("First & Last Name:");
        studentNameLabel.setBounds(20, 50, 150, 25);
        createStudentPanel.add(studentNameLabel);

        studentNameText = new JTextField(20);
        studentNameText.setBounds(150, 50, 165, 25);
        createStudentPanel.add(studentNameText);

        studentUsernameLabel = new JLabel("Username:");
        studentUsernameLabel.setBounds(20, 80, 80, 25);
        createStudentPanel.add(studentUsernameLabel);

        studentUsernameText = new JTextField(20);
        studentUsernameText.setBounds(150, 80, 165, 25);
        createStudentPanel.add(studentUsernameText);

        studentPasswordLabel = new JLabel("Password:");
        studentPasswordLabel.setBounds(20, 110, 80, 25);
        createStudentPanel.add(studentPasswordLabel);

        studentPasswordText = new JTextField(20);
        studentPasswordText.setBounds(150, 110, 165, 25);
        createStudentPanel.add(studentPasswordText);

        createStudentAccountButton = new JButton("Create");
        createStudentAccountButton.setBounds(170, 150, 90, 25);
        createStudentAccountButton.addActionListener(new Main());
        createStudentPanel.add(createStudentAccountButton);

        createStudentAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createStudentFrame.setVisible(false);
                createStudentFrame.dispose();
                accountCreatedStudent();
            }
        });

        createStudentAccountBackButton = new JButton("Back");
        createStudentAccountBackButton.setBounds(70, 150, 90, 25);
        createStudentAccountBackButton.addActionListener(new Main());
        createStudentPanel.add(createStudentAccountBackButton);

        createStudentAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createStudentFrame.setVisible(false);
                createStudentFrame.dispose();
                mainMenu();
            }
        });


        createStudentFrame.setVisible(true);
    }

    public static void accountCreatedStudent() {
        accountCreatedStudentFrame = new JFrame();
        accountCreatedStudentPanel = new JPanel();
        accountCreatedStudentFrame.setSize(400, 300);
        accountCreatedStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountCreatedStudentFrame.add(accountCreatedStudentPanel);
        accountCreatedStudentPanel.setLayout(null);

        studentAccountCreatedLabel = new JLabel("Account successfully created!");
        studentAccountCreatedLabel.setBounds(80, 20, 200, 25);
        accountCreatedStudentPanel.add(studentAccountCreatedLabel);

        studentLogInButton = new JButton("Log In");
        studentLogInButton.setBounds(130, 60, 80, 25);
        studentLogInButton.addActionListener(new Main());
        accountCreatedStudentPanel.add(studentLogInButton);

        studentLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountCreatedStudentFrame.setVisible(false);
                accountCreatedStudentFrame.dispose();
                studentLogIn();
            }
        });

        accountCreatedStudentFrame.setVisible(true);

    }

    public static void studentLogIn() {
        studentLogInFrame = new JFrame();
        studentLogInPanel = new JPanel();
        studentLogInFrame.setSize(400, 300);
        studentLogInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentLogInFrame.add(studentLogInPanel);

        studentLogInPanel.setLayout(null);

        welcomeStudentsLabel = new JLabel("Welcome students!");
        welcomeStudentsLabel.setBounds(80, 20, 150, 25);
        studentLogInPanel.add(welcomeStudentsLabel);

        studentLogInUsernameLabel = new JLabel("Username:");
        studentLogInUsernameLabel.setBounds(20, 50, 80, 25);
        studentLogInPanel.add(studentLogInUsernameLabel);

        studentLogInPasswordLabel = new JLabel("Password:");
        studentLogInPasswordLabel.setBounds(20, 80, 80, 25);
        studentLogInPanel.add(studentLogInPasswordLabel);

        studentLogInUsernameText = new JTextField(20);
        studentLogInUsernameText.setBounds(100, 50, 165, 25);
        studentLogInPanel.add(studentLogInUsernameText);

        studentLogInPasswordText = new JTextField(20);
        studentLogInPasswordText.setBounds(100, 80, 165, 25);
        studentLogInPanel.add(studentLogInPasswordText);

        studentLogInButton = new JButton("Login");
        studentLogInButton.setBounds(130, 120, 80, 25);
        studentLogInButton.addActionListener(new Main());
        studentLogInPanel.add(studentLogInButton);

        studentLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentLogInFrame.setVisible(false);
                studentLogInFrame.dispose();
                studentMenu();
            }
        });

        studentLogInBackButton = new JButton("Back");
        studentLogInBackButton.setBounds(30, 120, 80, 25);
        studentLogInBackButton.addActionListener(new Main());
        studentLogInPanel.add(studentLogInBackButton);

        studentLogInBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentLogInFrame.setVisible(false);
                studentLogInFrame.dispose();
                mainMenu();
            }
        });

        studentLogInFrame.setVisible(true);
    }

    public static void studentMenu() {
        studentMenuFrame = new JFrame();
        studentMenuPanel = new JPanel();
        studentMenuFrame.setSize(400, 300);
        studentMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentMenuFrame.add(studentMenuPanel);

        lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        studentMenuPanel.add(lsmToolLabel);

        takeQuizButton = new JButton("Take a Quiz");
        takeQuizButton.setBounds(80, 50, 250, 25);
        takeQuizButton.addActionListener(new Main());
        studentMenuPanel.add(takeQuizButton);

        takeQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenuFrame.setVisible(false);
                studentMenuFrame.dispose();
                chooseCourseForTakeQuiz();
            }
        });

        viewGradedQuizButton = new JButton("View Graded Quiz");
        viewGradedQuizButton.setBounds(80, 80, 250, 25);
        viewGradedQuizButton.addActionListener(new Main());
        studentMenuPanel.add(viewGradedQuizButton);

        viewGradedQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenuFrame.setVisible(false);
                studentMenuFrame.dispose();
                viewGradedQuiz();
            }
        });

        editStudentAccountButton = new JButton("Edit Account");
        editStudentAccountButton.setBounds(80, 110, 250, 25);
        editStudentAccountButton.addActionListener(new Main());
        studentMenuPanel.add(editStudentAccountButton);

        editStudentAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenuFrame.setVisible(false);
                studentMenuFrame.dispose();
                editStudentAccount();
            }
        });

        studentLogOutButton = new JButton("Logout");
        studentLogOutButton.setBounds(80, 140, 250, 25);
        studentLogOutButton.addActionListener(new Main());
        studentMenuPanel.add(studentLogOutButton);

        //TODO what should happen when the student log outs

        studentLogOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });


        studentMenuPanel.setLayout(null);
        studentMenuFrame.setVisible(true);
    }

    public static void chooseCourseForTakeQuiz() {
        chooseCourseForTakeQuizFrame = new JFrame();
        chooseCourseForTakeQuizPanel = new JPanel();
        chooseCourseForTakeQuizFrame.setSize(400, 300);
        chooseCourseForTakeQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseCourseForTakeQuizFrame.add(chooseCourseForTakeQuizPanel);

        chooseCourseTitleLabel = new JLabel("Choose Course To Take Quiz From");
        chooseCourseTitleLabel.setBounds(100, 20, 500, 25);
        chooseCourseForTakeQuizPanel.add(chooseCourseTitleLabel);

        studentChooseCourseLabel = new JLabel("Which course would you like to take a quiz from?");
        studentChooseCourseLabel.setBounds(30, 50, 700, 25);
        chooseCourseForTakeQuizPanel.add(studentChooseCourseLabel);

        //below array needs to contain the list of courses that have bene created so far
        String[] coursesToTakeQuizFromOptions = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> jComboBox = new JComboBox<>(coursesToTakeQuizFromOptions);
        jComboBox.setBounds(120, 80, 140, 20);
        chooseCourseForTakeQuizPanel.add(jComboBox);


        courseChoosenForQuizNextButton = new JButton("Next");
        courseChoosenForQuizNextButton.setBounds(220, 180, 110, 25);
        courseChoosenForQuizNextButton.addActionListener(new Main());
        chooseCourseForTakeQuizPanel.add(courseChoosenForQuizNextButton);

        courseChoosenForQuizNextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseCourseForTakeQuizFrame.setVisible(false);
                chooseCourseForTakeQuizFrame.dispose();
                whichQuizToTake();
            }
        });

        chooseCourseForTakeQuizPanel.setLayout(null);
        chooseCourseForTakeQuizFrame.setVisible(true);

    }

    public static void whichQuizToTake() {
        whichQuizToTakeFrame = new JFrame();
        whichQuizToTakePanel = new JPanel();
        whichQuizToTakeFrame.setSize(400, 300);
        whichQuizToTakeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        whichQuizToTakeFrame.add(whichQuizToTakePanel);

        chooseQuizTakeTitleLabel = new JLabel("Choose Quiz To Take");
        chooseQuizTakeTitleLabel.setBounds(120, 20, 500, 25);
        whichQuizToTakePanel.add(chooseQuizTakeTitleLabel);

        studentChooseQuizLabel = new JLabel("Which quiz would you like to take?");
        studentChooseQuizLabel.setBounds(30, 50, 700, 25);
        whichQuizToTakePanel.add(studentChooseQuizLabel);

        //below array needs to contain the list of quizzes for the course choose by the user
        String[] quizzesToTakeOptions = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> jComboBox = new JComboBox<>(quizzesToTakeOptions);
        jComboBox.setBounds(120, 80, 140, 20);
        whichQuizToTakePanel.add(jComboBox);


        quizChoosenNextButton = new JButton("Next");
        quizChoosenNextButton.setBounds(220, 180, 110, 25);
        quizChoosenNextButton.addActionListener(new Main());
        whichQuizToTakePanel.add(quizChoosenNextButton);

        quizChoosenNextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                whichQuizToTakeFrame.setVisible(false);
                whichQuizToTakeFrame.dispose();
                quizStudentTakes();

            }
        });

        whichQuizToTakePanel.setLayout(null);
        whichQuizToTakeFrame.setVisible(true);
    }

    public static void quizStudentTakes() {
        quizStudentTakesFrame1 = new JFrame();
        quizStudentTakesPanel1 = new JPanel();
        quizStudentTakesFrame1.setSize(400, 300);
        quizStudentTakesFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizStudentTakesFrame1.add(quizStudentTakesPanel1);


        questionOneTitleLabel = new JLabel("Question 1");
        questionOneTitleLabel.setBounds(120, 20, 500, 25);
        quizStudentTakesPanel1.add(questionOneTitleLabel);

        //below label will display the first question of the quiz
        questionOneStuQuizLabel = new JLabel("What day is it today?");
        questionOneStuQuizLabel.setBounds(30, 50, 700, 25);
        quizStudentTakesPanel1.add(questionOneStuQuizLabel);

        //OPTIONS DISPLAYED (MULTIPLE CHOICE)
        optionOneMC = new JLabel("Option 1:");
        optionOneMC.setBounds(30, 80, 300, 25);
        quizStudentTakesPanel1.add(optionOneMC);

        optionTwoMC = new JLabel("Option 2:");
        optionTwoMC.setBounds(30, 110, 300, 25);
        quizStudentTakesPanel1.add(optionTwoMC);

        optionThreeMC = new JLabel("Option 3:");
        optionThreeMC.setBounds(30, 140, 300, 25);
        quizStudentTakesPanel1.add(optionThreeMC);

        optionFourMC = new JLabel("Option 4:");
        optionFourMC.setBounds(30, 170, 300, 25);
        quizStudentTakesPanel1.add(optionFourMC);


        typeInAnswerLabel = new JLabel("Type in Answer: ");
        typeInAnswerLabel.setBounds(30, 200, 700, 25);
        quizStudentTakesPanel1.add(typeInAnswerLabel);

        questionOneStuAns = new JTextField(20);
        questionOneStuAns.setBounds(140, 200, 165, 25);
        quizStudentTakesPanel1.add(questionOneStuAns);

        quizStuTakesNextButton = new JButton("Next");
        quizStuTakesNextButton.setBounds(250, 230, 110, 25);
        quizStuTakesNextButton.addActionListener(new Main());
        quizStudentTakesPanel1.add(quizStuTakesNextButton);

        quizStuTakesNextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizStudentTakesFrame1.setVisible(false);
                quizStudentTakesFrame1.dispose();

                // 3 indicates the number of question in the quiz choosen by the student, 3 is just a number used for testing
                for (int i = 0; i < 3; i++) {
                    quizStudentTakes();
                }

                quizSubmitted();

            }
        });

        quizStudentTakesPanel1.setLayout(null);
        quizStudentTakesFrame1.setVisible(true);

    }

    public static void quizSubmitted() {
        quizSubmittedFrame = new JFrame();
        quizSubmittedPanel = new JPanel();
        quizSubmittedFrame.setSize(400, 300);
        quizSubmittedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizSubmittedFrame.add(quizSubmittedPanel);

        quizSubmittedLabel = new JLabel("You are done with the quiz and it has been submitted!");
        quizSubmittedLabel.setBounds(30, 20, 500, 25);
        quizSubmittedPanel.add(quizSubmittedLabel);

        quizDoneBackToStuMenuButton = new JButton("Back To HomePage");
        quizDoneBackToStuMenuButton.setBounds(90, 60, 200, 25);
        quizDoneBackToStuMenuButton.addActionListener(new Main());
        quizSubmittedPanel.add(quizDoneBackToStuMenuButton);

        quizDoneBackToStuMenuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizSubmittedFrame.setVisible(false);
                quizSubmittedFrame.dispose();

                studentMenu();

            }
        });


        quizSubmittedPanel.setLayout(null);
        quizSubmittedFrame.setVisible(true);


    }


    public static void viewGradedQuiz() {
        viewGradedQuizFrame = new JFrame();
        viewGradedQuizPanel = new JPanel();
        viewGradedQuizFrame.setSize(400, 300);
        viewGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewGradedQuizFrame.add(viewGradedQuizPanel);

        viewGradedQuizTitleLabel = new JLabel("View a Graded Quiz");
        viewGradedQuizTitleLabel.setBounds(140, 20, 500, 25);
        viewGradedQuizPanel.add(viewGradedQuizTitleLabel);

        whichGradedQuizToViewLabel = new JLabel("Which of the graded quizzes do you want to view?");
        whichGradedQuizToViewLabel.setBounds(30, 50, 500, 25);
        viewGradedQuizPanel.add(whichGradedQuizToViewLabel);

        // below array has to contain the graded quizzes for the student that is logged in
        String[] gradedQuizOptions = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        JComboBox<String> jComboBox = new JComboBox<>(gradedQuizOptions);
        jComboBox.setBounds(120, 80, 140, 20);
        viewGradedQuizPanel.add(jComboBox);

        viewQuizButton = new JButton("Back To HomePage");
        viewQuizButton.setBounds(90, 60, 200, 25);
        viewQuizButton.addActionListener(new Main());
        viewGradedQuizPanel.add(viewQuizButton);

        quizDoneBackToStuMenuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewGradedQuizFrame.setVisible(false);
                viewGradedQuizFrame.dispose();

                showsStuGradedQuiz();
            }
        });

        viewGradedQuizPanel.setLayout(null);
        viewGradedQuizFrame.setVisible(true);

    }

    public static void showsStuGradedQuiz(){
        stuGradedQuizFrame = new JFrame();
        stuGradedQuizPanel = new JPanel();
        stuGradedQuizFrame.setSize(500, 400);
        stuGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stuGradedQuizFrame.add(stuGradedQuizPanel);

        stuGradedQuizLabel = new JLabel("Graded Quiz");
        stuGradedQuizLabel.setBounds(210, 20, 500, 25);
        stuGradedQuizPanel.add(stuGradedQuizLabel);

        showsStuGradedQuizText = new JTextArea();
        showsStuGradedQuizText.setBounds(30,50, 400,200);
        stuGradedQuizPanel.add(showsStuGradedQuizText);


        stuGradedQuizScreenBackButton = new JButton("Back To HomePage");
        stuGradedQuizScreenBackButton.setBounds(270, 320, 190, 25);
        stuGradedQuizScreenBackButton.addActionListener(new Main());
        stuGradedQuizPanel.add(stuGradedQuizScreenBackButton);

        stuGradedQuizScreenBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stuGradedQuizFrame.setVisible(false);
                stuGradedQuizFrame.dispose();
                teacherQuizMenu();

            }
        });

        stuGradedQuizPanel.setLayout(null);
        stuGradedQuizFrame.setVisible(true);

    }

    public static void editStudentAccount() {
        editStudentAccountFrame = new JFrame();
        editStudentAccountPanel = new JPanel();
        editStudentAccountFrame.setSize(400, 300);
        editStudentAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editStudentAccountFrame.add(editStudentAccountPanel);

        editStudentAccountPanel.setLayout(null);

        editStuAccountLabel = new JLabel("Edit Student Account");
        editStuAccountLabel.setBounds(130, 20, 200, 25);
        editStudentAccountPanel.add(editStuAccountLabel);

        editedStuNameLabel = new JLabel("First & Last Name:");
        editedStuNameLabel.setBounds(20, 50, 150, 25);
        editStudentAccountPanel.add(editedStuNameLabel);

        editedStuNameText = new JTextField(20);
        editedStuNameText.setBounds(150, 50, 165, 25);
        editStudentAccountPanel.add(editedStuNameText);

        editedStuUsernameLabel = new JLabel("Username:");
        editedStuUsernameLabel.setBounds(20, 80, 80, 25);
        editStudentAccountPanel.add(editedStuUsernameLabel);

        editedStuUsernameText = new JTextField(20);
        editedStuUsernameText.setBounds(150, 80, 165, 25);
        editStudentAccountPanel.add(editedStuUsernameText);

        editedStuPasswordLabel = new JLabel("Password:");
        editedStuPasswordLabel.setBounds(20, 110, 80, 25);
        editStudentAccountPanel.add(editedStuPasswordLabel);

        editedStuPasswordText = new JTextField(20);
        editedStuPasswordText.setBounds(150, 110, 165, 25);
        editStudentAccountPanel.add(editedStuPasswordText);

        updateStuAccountButton = new JButton("Save and Update Account");
        updateStuAccountButton.setBounds(30, 150, 200, 25);
        updateStuAccountButton.addActionListener(new Main());
        editStudentAccountPanel.add(updateStuAccountButton);

        //what should happen when the student save and updates their information (call the specific method that saves the updated data
        updateStuAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editStudentAccountFrame.setVisible(false);
                editStudentAccountFrame.dispose();
                editStudentAccountDone();

            }
        });


        editStuAccountBackButton = new JButton("Back");
        editStuAccountBackButton.setBounds(30, 180, 110, 25);
        editStuAccountBackButton.addActionListener(new Main());
        editStudentAccountPanel.add(editStuAccountBackButton);

        editStuAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editStudentAccountFrame.setVisible(false);
                editStudentAccountFrame.dispose();
                studentMenu();
            }
        });

        editStudentAccountFrame.setVisible(true);

    }

    public static void editStudentAccountDone(){
        editStudentAccountDoneFrame = new JFrame();
        editStudentAccountDonePanel = new JPanel();
        editStudentAccountDoneFrame.setSize(400, 300);
        editStudentAccountDoneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editStudentAccountDoneFrame.add(editStudentAccountDonePanel);

        editStudentAccountDonePanel.setLayout(null);

        accountUpdatedLabel = new JLabel("Account updated!");
        accountUpdatedLabel.setBounds(140, 30, 280, 25);
        editStudentAccountDonePanel.add(accountUpdatedLabel);

        editAccountDoneBackButton = new JButton("Back");
        editAccountDoneBackButton.setBounds(140, 60, 110, 25);
        editAccountDoneBackButton.addActionListener(new Main());
        editStudentAccountDonePanel.add(editAccountDoneBackButton);

        editAccountDoneBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editStudentAccountDoneFrame.setVisible(false);
                editStudentAccountDoneFrame.dispose();
                mainMenu();
            }
        });


        editStudentAccountDoneFrame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
