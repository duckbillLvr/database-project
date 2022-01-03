import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

//dialog
class MyClubTable extends JDialog {
	private JTextField idStudentText = new JTextField(5);
	private JTextField idStudent = new JTextField(10);
	private JButton okBtn = new JButton("����");
	private JButton cancelBtn = new JButton("���");

	public MyClubTable(DBProject2101.JPanel03 jPanel03, String title) {
		//super(jPanel03, title, true);
		setModal(true);
		setLayout(new FlowLayout());
		add(idStudentText);
		add(idStudent);
		add(okBtn);
		add(cancelBtn);
		idStudentText.setText("�й� �Է�");
		idStudentText.setEnabled(false);	
		setSize(200, 200);


		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idStudent.setText("");
				dispose();
			}
		});
	}
	public String getInputI() { 
		if(idStudent.getText().length() == 0) return null;
		else return idStudent.getText();
	}

}
class MyproTable extends JDialog {
	private JTextField iprofessorText = new JTextField(7);
	private JTextField idprofessor = new JTextField(10);
	private JTextField yearText = new JTextField(5);
	private JTextField year = new JTextField(10);
	private JTextField semesterText = new JTextField(5);
	private JTextField semester = new JTextField(10);
	private JButton okBtn = new JButton("����");
	private JButton cancelBtn = new JButton("���");

	public MyproTable(DBProject2101.JPanel02 JPanel02, String title) {
		//super(jPanel03, title, true);
		setModal(true);
		setLayout(new FlowLayout());
		add(iprofessorText);add(idprofessor);
		add(yearText);add(year);
		add(semesterText);add(semester);
		add(okBtn);add(cancelBtn);
		iprofessorText.setText("�����й� �Է�");iprofessorText.setEnabled(false);
		yearText.setText("���� �Է�");yearText.setEnabled(false);
		semesterText.setText("�б� �Է�");semesterText.setEnabled(false);
		setSize(250, 200);

		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idprofessor.setText(null);
				year.setText(null);
				semester.setText(null);
				dispose();
			}
		});
	}

	public String getInputI() { 
		if(idprofessor.getText().length() == 0) return null;
		else return idprofessor.getText();
	}
	public String getInputY() { 
		if(year.getText().length() == 0) return null;
		else return year.getText();
	}
	public String getInputS() { 
		if(semester.getText().length() == 0) return null;
		else return semester.getText();
	}
}
class MyproTable2 extends JDialog {
	private JTextField iprofessorText = new JTextField(7);
	private JTextField idprofessor = new JTextField(10);
	private JButton okBtn = new JButton("����");
	private JButton cancelBtn = new JButton("���");

	public MyproTable2(DBProject2101.JPanel02 JPanel02, String title) {
		//super(jPanel03, title, true);
		setModal(true);
		setLayout(new FlowLayout());
		add(iprofessorText);add(idprofessor);
		add(okBtn);add(cancelBtn);
		iprofessorText.setText("�����й� �Է�");iprofessorText.setEnabled(false);
		setSize(250, 130);

		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idprofessor.setText("");
				dispose();
			}
		});
	}
	public String getInputI() { 
		if(idprofessor.getText().length() == 0) return null;
		else return idprofessor.getText();
	}

}
class MyproTable3 extends JDialog {
	private JTextField iprofessorText = new JTextField(7); private JTextField idprofessor = new JTextField(10);
	private JTextField ipstText = new JTextField(7); private JTextField idst = new JTextField(10);
	private JTextField idclassText = new JTextField(7); private JTextField idclass = new JTextField(10);
	private JTextField attendText = new JTextField(7); private JTextField attend = new JTextField(10);
	private JTextField midText = new JTextField(7); private JTextField mid = new JTextField(10);
	private JTextField finalpText = new JTextField(7); private JTextField finalp = new JTextField(10);
	private JTextField elsepText = new JTextField(7); private JTextField elsep = new JTextField(10);
	private JTextField totalText = new JTextField(7); private JTextField total = new JTextField(10);
	private JTextField gradeText = new JTextField(7); private JTextField grade = new JTextField(10);
	private JButton okBtn = new JButton("����"); private JButton cancelBtn = new JButton("���");

	public MyproTable3(DBProject2101.JPanel02 JPanel02, String title) {
		//super(jPanel03, title, true);
		setModal(true);
		setLayout(new FlowLayout());
		add(iprofessorText); add(idprofessor);add(ipstText); add(idst);
		add(idclassText); add(idclass);add(attendText); add(attend);
		add(midText); add(mid);add(finalpText); add(finalp);
		add(elsepText); add(elsep);add(totalText); add(total);
		add(gradeText); add(grade);add(okBtn); add(cancelBtn);
		iprofessorText.setText("�����й� �Է�"); iprofessorText.setEnabled(false);
		ipstText.setText("�л��й� �Է�"); ipstText.setEnabled(false);
		idclassText.setText("�����й� �Է�"); idclassText.setEnabled(false);
		attendText.setText("�⼮���� �Է�"); attendText.setEnabled(false);
		midText.setText("�߰����� �Է�"); midText.setEnabled(false);
		finalpText.setText("�⸻���� �Է�"); finalpText.setEnabled(false);
		elsepText.setText("�׿����� �Է�"); elsepText.setEnabled(false);
		totalText.setText("���� �Է�"); totalText.setEnabled(false);
		gradeText.setText("���� �Է�"); gradeText.setEnabled(false);
		setSize(250, 350);

		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idprofessor.setText(null); idst.setText(null);
				idclass.setText(null); attend.setText(null);
				mid.setText(null); finalp.setText(null);
				elsep.setText(null); total.setText(null); grade.setText(null); 
				dispose();
			}
		});
	}
	public String getidprofessor() { 
		if(idprofessor.getText().length() == 0) return null;
		else return idprofessor.getText();
	}
	public String getidst() { 
		if(idst.getText().length() == 0) return null;
		else return idst.getText();
	}
	public String getidclass() { 
		if(idclass.getText().length() == 0) return null;
		else return idclass.getText();
	}
	public String getattend() { 
		if(attend.getText().length() == 0) return null;
		else return attend.getText();
	}
	public String getmidI() { 
		if(mid.getText().length() == 0) return null;
		else return mid.getText();
	}
	public String getfinalp() { 
		if(finalp.getText().length() == 0) return null;
		else return finalp.getText();
	}
	public String getelsep() { 
		if(elsep.getText().length() == 0) return null;
		else return elsep.getText();
	}
	public String gettotalI() { 
		if(total.getText().length() == 0) return null;
		else return total.getText();
	}
	public String getgrade() { 
		if(grade.getText().length() == 0) return null;
		else return grade.getText();
	}


}
//dialog 
//student q1 dialog
class MyStudentbtnTable extends JDialog {
	private JTextField idStudentText = new JTextField(5);
	private JTextField idStudent = new JTextField(10);
	private JTextField yearText = new JTextField(5);
	private JTextField year = new JTextField(10);
	private JTextField semesterText = new JTextField(5);
	private JTextField semester = new JTextField(10);
	private JButton okBtn = new JButton("����");
	private JButton cancelBtn = new JButton("���");

	public MyStudentbtnTable(DBProject2101.JPanel03 jPanel03, String title) {
		//super(jPanel03, title, true);
		setModal(true);
		setLayout(new FlowLayout());
		add(idStudentText);
		add(idStudent);
		add(yearText);
		add(year);
		add(semesterText);
		add(semester);
		add(okBtn);
		add(cancelBtn);
		idStudentText.setText("�й� �Է�");
		idStudentText.setEnabled(false);
		yearText.setText("���� �Է�");
		yearText.setEnabled(false);
		semesterText.setText("�б� �Է�");
		semesterText.setEnabled(false);
		setSize(200, 200);
		idStudent.setText("");
		year.setText("");
		semester.setText("");

		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				setVisible(false); 
			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				idStudent.setText(null); year.setText(null);
				semester.setText(null);
				dispose();
			}
		});
	}

	public String getInputI() { 
		if(idStudent.getText().length() == 0) return null;
		else return idStudent.getText();
	}
	public String getInputY() { 
		if(year.getText().length() == 0) return null;
		else return year.getText();
	}
	public String getInputS() { 
		if(semester.getText().length() == 0) return null;
		else return semester.getText();
	}
}

//AdminInsert
class MyAdminInsert extends JDialog{
	private JTextField [] Tinput = new JTextField [15];
	private JTextField [] input = new JTextField [15];
	private String [] str;
	private String title;
	private int N;

	private JButton okBtn = new JButton("����");
	private JButton cancelBtn = new JButton("���");
	public MyAdminInsert() {};
	public MyAdminInsert(int n, String [] str, String title) {
		this.title = title;
		//super(jPanel03, title, true);
		this.N = n;
		this.str = str.clone();
		for(int i=0; i<N; i++) {
			Tinput[i] = new JTextField(10);
			input[i] = new JTextField(10);
			add(Tinput[i]);
			add(input[i]);
			Tinput[i].setText(str[i]);
			Tinput[i].setEditable(false);
			Tinput[i].setFont(new Font("���� ���", Font.BOLD, 12));
		}
		add(okBtn);
		add(cancelBtn);
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				setVisible(false); 
			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				cancelBtn();
				setTextInit();
				dispose();
			}
		});
	}
	public int returnSize() {
		return N;
	}
	public void cancelBtn(){
		for(int i=0; i<N; i++)
			input[i].setText(null);
	}
	public String getInput(int idx) { 
		if(input[idx].getText().length() == 0) return null;
		else return input[idx].getText();
	}
	public void setTextInit() {
		for(int i=0; i<N; i++) {
			input[i].setText("");
		}
	}
}
class MyAdminInsert1 extends MyAdminInsert {
	static String [] str = {"�й�", "�̸�", "�ּ�", "��ȭ��ȣ", "�̸���", "���ΰ���", "��������", ""
			+ "�����а�", "�г�", "�б�", "������"};
	public MyAdminInsert1(DBProject2101.JPanel01 jPanel01, String title) {
		super(str.length, str, title);
		setModal(true);
		setLayout(new FlowLayout());
		setSize(280, 400);
	}
}
class MyAdminInsert2 extends MyAdminInsert {
	static String [] str = {"������ȣ", "�̸�", "�ּ�", "��ȭ��ȣ", "�̸���", "�Ҽ��а�"};
	public MyAdminInsert2(DBProject2101.JPanel01 jPanel01, String title) {
		super(str.length, str, title);
		setModal(true);
		setLayout(new FlowLayout());
		setSize(280, 300);
	}
}
class MyAdminInsert3 extends MyAdminInsert {
	static String [] str = {"�а���ȣ", "�а���", "��ȭ��ȣ", "�ּ�", "�а���"};
	public MyAdminInsert3(DBProject2101.JPanel01 jPanel01, String title) {
		super(str.length, str, title);
		setModal(true);
		setLayout(new FlowLayout());
		setSize(280, 250);
	}
}
class MyAdminInsert4 extends MyAdminInsert {
	static String [] str = {"���¹�ȣ", "�йݹ�ȣ", "���¸�", "���ǿ���", "���۽ð�", "���ǽð�", "��������", "�����а�", "����", "�б�"};
	public MyAdminInsert4(DBProject2101.JPanel01 jPanel01, String title) {
		super(str.length, str, title);
		setModal(true);
		setLayout(new FlowLayout());
		setSize(280, 400);
	}
}
class MyAdminInsert5 extends MyAdminInsert {
	static String [] str = {"���Ƹ���ȣ", "���Ƹ���", "�Ҽ��л���", "���Ƹ���", "���Ƹ� ��������", "���Ƹ� ȸ���л�"};
	public MyAdminInsert5(DBProject2101.JPanel01 jPanel01, String title) {
		super(str.length, str, title);
		setModal(true);
		setLayout(new FlowLayout());
		setSize(280, 280);
	}
}
class MyAdminInsert6 extends MyAdminInsert {
	static String [] str = {"�л���ȣ", "������ȣ"};
	public MyAdminInsert6(DBProject2101.JPanel01 jPanel01, String title) {
		super(str.length, str, title);
		setModal(true);
		setLayout(new FlowLayout());
		setSize(280, 150);
	}
}
class MyAdminInsert7 extends MyAdminInsert {
	static String [] str = {"�л���ȣ", "��ϱ� ���� ����", "��ϱ� ���� �б�", "��ϱ� �Ѿ�", "�����Ѿ�", "������ ������"};
	public MyAdminInsert7(DBProject2101.JPanel01 jPanel01, String title) {
		super(str.length, str, title);
		setModal(true);
		setLayout(new FlowLayout());
		setSize(280, 250);
	}
}
class MyAdminInsert8 extends MyAdminInsert {
	static String [] str = {"������ȣ", "�л���ȣ", "���ǹ�ȣ", "�⼮����", "�߰����", "�⸻���", "��Ÿ����", "����", "����", "����", "�б�"};
	public MyAdminInsert8(DBProject2101.JPanel01 jPanel01, String title) {
		super(str.length, str, title);
		setModal(true);
		setLayout(new FlowLayout());
		setSize(280, 400);
	}
}

public class DBProject2101 extends JFrame{
	JTabbedPane jtp = new JTabbedPane();
	JPanel01 jp1 = null;
	JPanel02 jp2 = null;
	JPanel03 jp3 = null;
	//JButton btnReset, btnInput, btnDelete, btnAlter, btnTabel;
	//JTextArea txtResult;


	static Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	String Driver = "";
	String url = "jdbc:mysql://localhost:3306/madang?&serverTimezone=Asia/Seoul&useSSL=false";
	String userid = "madang";
	String pwd = "madang";

	public DBProject2101() {
		super("Database Project Searching system");
		layInit();
		conDB();
		setVisible(true);
		setBounds(200, 200, 1100, 500); //������ġ,������ġ,���α���,���α���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void layInit() {
		jp1 = new JPanel01();
		jp2 = new JPanel02();
		jp3 = new JPanel03();
		jtp.addTab("������", jp1);
		jtp.addTab("����", jp2);
		jtp.addTab("�л�", jp3);

		add(jtp);
	}
	public void createTable() {
		try {
			stmt = con.createStatement();
			stmt.executeUpdate("drop table if exists attend");
			stmt.executeUpdate("drop table if exists tuition");
			stmt.executeUpdate("drop table if exists studentclub");
			stmt.executeUpdate("drop table if exists club");
			stmt.executeUpdate("drop table if exists class");
			stmt.executeUpdate("drop table if exists student");
			stmt.executeUpdate("drop table if exists professor");
			stmt.executeUpdate("drop table if exists department");

			String sql1 = "CREATE TABLE IF NOT EXISTS `madang`.`department` (\r\n"
					+ "  `idDepartment` INT NOT NULL,\r\n"
					+ "  `name` VARCHAR(45) NULL,\r\n"
					+ "  `phoneNumber` VARCHAR(45) NULL,\r\n"
					+ "  `address` VARCHAR(45) NULL,\r\n"
					+ "  `mProfessor` VARCHAR(45) NULL,\r\n"
					+ "  PRIMARY KEY (`idDepartment`))";

			String sql2 = "CREATE TABLE IF NOT EXISTS `madang`.`professor` (\r\n"
					+ "  `idProfessor` INT NOT NULL,\r\n"
					+ "  `name` VARCHAR(45) NULL,\r\n"
					+ "  `address` VARCHAR(45) NULL,\r\n"
					+ "  `phoneNumber` VARCHAR(45) NULL,\r\n"
					+ "  `email` VARCHAR(45) NULL,\r\n"
					+ "  `department` INT NOT NULL,\r\n"
					+ "  PRIMARY KEY (`idProfessor`),\r\n"
					+ "  INDEX `fk_professor_department1_idx` (`department` ASC) VISIBLE,\r\n"
					+ "  CONSTRAINT `fk_professor_department1`\r\n"
					+ "    FOREIGN KEY (`department`)\r\n"
					+ "    REFERENCES `madang`.`department` (`idDepartment`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION)\r\n"
					+ "";

			String sql3 = "CREATE TABLE IF NOT EXISTS `madang`.`student` (\r\n"
					+ "  `idStudent` INT NOT NULL,\r\n"
					+ "  `name` VARCHAR(45) NULL,\r\n"
					+ "  `address` VARCHAR(45) NULL,\r\n"
					+ "  `phoneNumber` VARCHAR(45) NULL,\r\n"
					+ "  `email` VARCHAR(45) NULL,\r\n"
					+ "  `account` VARCHAR(45) NULL,\r\n"
					+ "  `mProfessor` INT NOT NULL,\r\n"
					+ "  `mDepartment` INT NOT NULL,\r\n"
					+ "  `schoolYear` INT NULL,\r\n"
					+ "  `studentSemester` INT NULL,\r\n"
					+ "  `subMajor` INT NULL,\r\n"
					+ "  PRIMARY KEY (`idStudent`),\r\n"
					+ "  INDEX `fk_student_professor_idx` (`mProfessor` ASC) VISIBLE,\r\n"
					+ "  INDEX `fk_student_department1_idx` (`mDepartment` ASC) VISIBLE,\r\n"
					+ "  INDEX `fk_student_department2_idx` (`subMajor` ASC) VISIBLE,\r\n"
					+ "  CONSTRAINT `fk_student_professor`\r\n"
					+ "    FOREIGN KEY (`mProfessor`)\r\n"
					+ "    REFERENCES `madang`.`professor` (`idProfessor`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION,\r\n"
					+ "  CONSTRAINT `fk_student_department1`\r\n"
					+ "    FOREIGN KEY (`mDepartment`)\r\n"
					+ "    REFERENCES `madang`.`department` (`idDepartment`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION,\r\n"
					+ "  CONSTRAINT `fk_student_department2`\r\n"
					+ "    FOREIGN KEY (`subMajor`)\r\n"
					+ "    REFERENCES `madang`.`department` (`idDepartment`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION)";
			String sql4 = "CREATE TABLE IF NOT EXISTS `madang`.`class` (\r\n"
					+ "  `idClass` INT NOT NULL,\r\n"
					+ "  `sClass` INT NULL,\r\n"
					+ "  `name` VARCHAR(45) NULL,\r\n"
					+ "  `week` VARCHAR(45) NULL,\r\n"
					+ "  `timeOfStart` INT NULL,\r\n"
					+ "  `credit` INT NULL,\r\n"
					+ "  `time` INT NULL,\r\n"
					+ "  `room` INT NULL,\r\n"
					+ "  `professor` INT NOT NULL,\r\n"
					+ "  `openDepartment` INT NOT NULL,\r\n"
					+ "  PRIMARY KEY (`idClass`),\r\n"
					+ "  INDEX `fk_class_professor1_idx` (`professor` ASC) VISIBLE,\r\n"
					+ "  INDEX `fk_class_department1_idx` (`openDepartment` ASC) VISIBLE,\r\n"
					+ "  CONSTRAINT `fk_class_professor1`\r\n"
					+ "    FOREIGN KEY (`professor`)\r\n"
					+ "    REFERENCES `madang`.`professor` (`idProfessor`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION,\r\n"
					+ "  CONSTRAINT `fk_class_department1`\r\n"
					+ "    FOREIGN KEY (`openDepartment`)\r\n"
					+ "    REFERENCES `madang`.`department` (`idDepartment`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION)";
			String sql5 = "CREATE TABLE IF NOT EXISTS `madang`.`club` (\r\n"
					+ "  `idClub` INT NOT NULL,\r\n"
					+ "  `name` VARCHAR(45) NULL,\r\n"
					+ "  `numStudent` INT NULL,\r\n"
					+ "  `room` INT NULL,\r\n"
					+ "  `cProfessor` INT NOT NULL,\r\n"
					+ "  `pStudent` INT NOT NULL,\r\n"
					+ "  PRIMARY KEY (`idClub`),\r\n"
					+ "  INDEX `fk_club_professor1_idx` (`cProfessor` ASC) VISIBLE,\r\n"
					+ "  INDEX `fk_club_student1_idx` (`pStudent` ASC) VISIBLE,\r\n"
					+ "  CONSTRAINT `fk_club_professor1`\r\n"
					+ "    FOREIGN KEY (`cProfessor`)\r\n"
					+ "    REFERENCES `madang`.`professor` (`idProfessor`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION,\r\n"
					+ "  CONSTRAINT `fk_club_student1`\r\n"
					+ "    FOREIGN KEY (`pStudent`)\r\n"
					+ "    REFERENCES `madang`.`student` (`idStudent`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION)\r\n"
					+ "";
			String sql6 = "CREATE TABLE IF NOT EXISTS `madang`.`tuition` (\r\n"
					+ "  `student` INT NOT NULL,\r\n"
					+ "  `yTuition` INT NULL,\r\n"
					+ "  `sTuition` INT NULL,\r\n"
					+ "  `totalTuition` INT NULL,\r\n"
					+ "  `payTuition` INT NULL,\r\n"
					+ "  `lastDate` VARCHAR(45) NULL,\r\n"
					+ "  INDEX `fk_tuition_student1_idx` (`student` ASC) VISIBLE,\r\n"
					+ "  CONSTRAINT `fk_tuition_student1`\r\n"
					+ "    FOREIGN KEY (`student`)\r\n"
					+ "    REFERENCES `madang`.`student` (`idStudent`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION)";
			String sql7 = "CREATE TABLE IF NOT EXISTS `madang`.`attend` (\r\n"
					+ "  `idProfessor` INT NOT NULL,\r\n"
					+ "  `idStudent` INT NOT NULL,\r\n"
					+ "  `idClass` INT NOT NULL,\r\n"
					+ "  `attendPoint` INT NULL,\r\n"
					+ "  `midPoint` INT NULL,\r\n"
					+ "  `finalPoint` INT NULL,\r\n"
					+ "  `elsePoint` INT NULL,\r\n"
					+ "  `total` INT NULL,\r\n"
					+ "  `grade` VARCHAR(45) NULL,\r\n"
					+ "  `year` INT NULL,\r\n"
					+ "  `semester` INT NULL,\r\n"
					+ "  INDEX `fk_professor_has_student_student1_idx` (`idStudent` ASC) VISIBLE,\r\n"
					+ "  INDEX `fk_professor_has_student_professor1_idx` (`idProfessor` ASC) VISIBLE,\r\n"
					+ "  INDEX `fk_attend_class1_idx` (`idClass` ASC) VISIBLE,\r\n"
					+ "  CONSTRAINT `fk_professor_has_student_professor1`\r\n"
					+ "    FOREIGN KEY (`idProfessor`)\r\n"
					+ "    REFERENCES `madang`.`professor` (`idProfessor`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION,\r\n"
					+ "  CONSTRAINT `fk_professor_has_student_student1`\r\n"
					+ "    FOREIGN KEY (`idStudent`)\r\n"
					+ "    REFERENCES `madang`.`student` (`idStudent`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION,\r\n"
					+ "  CONSTRAINT `fk_attend_class1`\r\n"
					+ "    FOREIGN KEY (`idClass`)\r\n"
					+ "    REFERENCES `madang`.`class` (`idClass`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION)";
			String sql8 = "CREATE TABLE IF NOT EXISTS `madang`.`studentclub` (\r\n"
					+ "  `idStudent` INT NOT NULL,\r\n"
					+ "  `idClub` INT NOT NULL,\r\n"
					+ "  PRIMARY KEY (`idStudent`, `idClub`),\r\n"
					+ "  INDEX `fk_student_has_club_club1_idx` (`idClub` ASC) VISIBLE,\r\n"
					+ "  INDEX `fk_student_has_club_student1_idx` (`idStudent` ASC) VISIBLE,\r\n"
					+ "  CONSTRAINT `fk_student_has_club_student1`\r\n"
					+ "    FOREIGN KEY (`idStudent`)\r\n"
					+ "    REFERENCES `madang`.`student` (`idStudent`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION,\r\n"
					+ "  CONSTRAINT `fk_student_has_club_club1`\r\n"
					+ "    FOREIGN KEY (`idClub`)\r\n"
					+ "    REFERENCES `madang`.`club` (`idClub`)\r\n"
					+ "    ON DELETE NO ACTION\r\n"
					+ "    ON UPDATE NO ACTION)";

			stmt.execute(sql1);
			stmt.execute(sql2);
			stmt.execute(sql3);
			stmt.execute(sql4);
			stmt.execute(sql5);
			stmt.execute(sql6);
			stmt.execute(sql7);
			stmt.execute(sql8);

			stmt.executeUpdate("INSERT INTO department VALUES(301, '�����а�', '02-2322-2315', '������', '������');");
			stmt.executeUpdate("INSERT INTO department VALUES(302, '�����а�', '02-3118-1528', '������', '������');");
			stmt.executeUpdate("INSERT INTO department VALUES(303, '�����а�', '02-8214-4008', '�ι���', '�迵��');");
			stmt.executeUpdate("INSERT INTO department VALUES(304, '�����а�', '02-7102-1807', '�ι���', '��뱹');");
			stmt.executeUpdate("INSERT INTO department VALUES(305, '�濵�а�', '02-3720-5555', '�ι���', '���ر�');");
			stmt.executeUpdate("INSERT INTO department VALUES(306, '�����а�', '02-6584-1036', '�ι���', '����ä');");
			stmt.executeUpdate("INSERT INTO department VALUES(307, 'ȣ�ڰ濵�а�', '02-7348-8522', '�濵��', '������');");
			stmt.executeUpdate("INSERT INTO department VALUES(308, '��������а�', '02-2330-3844', '�ڿ���', '���¹�');");
			stmt.executeUpdate("INSERT INTO department VALUES(309, '����õ���а�', '02-0253-3133', '�ڿ���', '������');");
			stmt.executeUpdate("INSERT INTO department VALUES(310, 'ȭ�а�', '02-5567-1567', '�ڿ���', '�ڱ�ȣ');");
			stmt.executeUpdate("INSERT INTO department VALUES(311, '����ý����а�', '02-7236-3176', '�ڿ���', '�ڿ���');");
			stmt.executeUpdate("INSERT INTO department VALUES(312, '���������а�', '02-5062-1527', '���а�', '���¼�');");
			stmt.executeUpdate("INSERT INTO department VALUES(313, '��ǻ�Ͱ��а�', '02-0347-4035', '���а�', '�ŵ���');");
			stmt.executeUpdate("INSERT INTO department VALUES(314, '����Ʈ�����а�', '02-0023-8316', '���а�', '�ŵ���');");
			stmt.executeUpdate("INSERT INTO department VALUES(315, '������ȣ�а�', '02-5510-4608', '���а�', '��ȿ��');");
			stmt.executeUpdate("INSERT INTO department VALUES(316, '�����ͻ��̾��а�', '02-3762-3120', '���а�', '������');");
			stmt.executeUpdate("INSERT INTO department VALUES(317, '���ɱ������а�', '02-2776-1836', '���а�', '����ȯ');");
			stmt.executeUpdate("INSERT INTO department VALUES(318, 'â�Ǽ���Ʈ�а�', '02-8663-7471', '���а�', '������');");
			stmt.executeUpdate("INSERT INTO department VALUES(319, '�ΰ������а�', '02-8054-3132', '���а�', '�̿���');");
			stmt.executeUpdate("INSERT INTO department VALUES(320, '������а�', '02-3435-2027', '�����', '�ּ���');");
			stmt.executeUpdate("INSERT INTO department VALUES(321, '����װ��а�', '02-7200-4346', '���а�', '�ѵ���');");
			stmt.executeUpdate("INSERT INTO department VALUES(322, '����żҴ��а�', '02-2416-8608', '���а�', '����');");
			stmt.executeUpdate("INSERT INTO department VALUES(323, 'ȸȭ��', '02-0532-4651', '���ɰ�', '�Ǳ���');");
			stmt.executeUpdate("INSERT INTO department VALUES(324, '���ǰ�', '02-4435-4637', '���ɰ�', '�蹮��');");
			stmt.executeUpdate("INSERT INTO department VALUES(325, 'ü���а�', '02-4855-4654', '���ɰ�', '��õ��');");


			stmt.executeUpdate("INSERT INTO professor VALUES(201, '������', '���ν� ó�α�', '010-2406-8472', 'ksk01@gmail.com', 301);");
			stmt.executeUpdate("INSERT INTO professor VALUES(202, '������', '����� ���ı�', '010-2363-8748', 'khj01@naver.com', 302);");
			stmt.executeUpdate("INSERT INTO professor VALUES(203, '�迵��', '�Ⱦ�� ���ȼ�', '010-2173-5685', 'kyb01@gmail.com', 303);");
			stmt.executeUpdate("INSERT INTO professor VALUES(204, '��뱹', '������ ���뱸', '010-4735-3018', 'kyk01@naver.com', 304);");
			stmt.executeUpdate("INSERT INTO professor VALUES(205, '���ر�', '����� ������', '010-6241-1361', 'khg01@daum.net', 305);");
			stmt.executeUpdate("INSERT INTO professor VALUES(206, '����ä', '��õ�� ������', '010-5388-6123', 'njc01@naver.com', 306);");
			stmt.executeUpdate("INSERT INTO professor VALUES(207, '������', '���ؽ� ������', '010-6883-6314', 'nhc01@gamil.com', 307);");
			stmt.executeUpdate("INSERT INTO professor VALUES(208, '���¹�', '���ν� ������', '010-5321-0281', 'msb01@gmail.com', 308);");
			stmt.executeUpdate("INSERT INTO professor VALUES(209, '������', '����� ������', '010-2655-3377', 'mhj01@gmail.com', 309);");
			stmt.executeUpdate("INSERT INTO professor VALUES(210, '�ڱ�ȣ', '���� ���籸', '010-4672-7073', 'pgh01@naver.com', 310);");
			stmt.executeUpdate("INSERT INTO professor VALUES(211, '�ڿ���', '����� ���ʱ�', '010-4073-1723', 'puc01@naver.com', 311);");
			stmt.executeUpdate("INSERT INTO professor VALUES(212, '���¼�', '��õ�� ����', '010-0846-1402', 'pts01@daum.net', 312);");
			stmt.executeUpdate("INSERT INTO professor VALUES(213, '�ŵ���', 'â���� ���걸', '010-4658-4602', 'sdk01@daum.net', 313);");
			stmt.executeUpdate("INSERT INTO professor VALUES(214, '�ŵ���', '����� ��걸', '010-1070-4865', 'sdl01@gmail.com', 313);");
			stmt.executeUpdate("INSERT INTO professor VALUES(215, '��ȿ��', 'û�ֽ� ������', '010-5750-3403', 'yhs01@gmail.com', 314);");
			stmt.executeUpdate("INSERT INTO professor VALUES(216, '������', '������ �д籸', '010-4144-7068', 'ysj01@naver.com', 314);");
			stmt.executeUpdate("INSERT INTO professor VALUES(217, '����ȯ', '����� ���α�', '010-5470-3777', 'yyh01@daum.net', 315);");
			stmt.executeUpdate("INSERT INTO professor VALUES(218, '������', '��õ�� ��籸', '010-0410-8271', 'yyl01@naver.com', 315);");
			stmt.executeUpdate("INSERT INTO professor VALUES(219, '�̿���', '���ν� ���ﱸ', '010-1812-8888', 'iyl01@naver.com', 316);");
			stmt.executeUpdate("INSERT INTO professor VALUES(220, '�ּ���', '����� ������', '010-5143-1431', 'csm01@gmail.com', 316);");
			stmt.executeUpdate("INSERT INTO professor VALUES(221, '�ѵ���', '������ �ȴٱ�', '010-3830-1516', 'hdl01@naver.com', 317);");
			stmt.executeUpdate("INSERT INTO professor VALUES(222, '����', '����� ���ϱ�', '010-8707-2041', 'jy01@gmail.com', 317);");
			stmt.executeUpdate("INSERT INTO professor VALUES(223, '�Ǳ���', '������ ������', '010-2328-7305', 'kkh01@daum.net', 318);");
			stmt.executeUpdate("INSERT INTO professor VALUES(224, '�蹮��', '�Ȼ�� ��ϱ�', '010-5741-3454', 'kms01@naver.com', 319);");
			stmt.executeUpdate("INSERT INTO professor VALUES(225, '��õ��', '������ �߿���', '010-1060-8785', 'kcs01@gmail.com', 320);");
			stmt.executeUpdate("INSERT INTO professor VALUES(226, '�����', '��õ�� ������', '010-7420-8065', 'kyl01@daum.net', 321);");
			stmt.executeUpdate("INSERT INTO professor VALUES(227, '�鼺��', '���ؽ� ������', '010-6207-2428', 'psy01@naver.com', 322);");
			stmt.executeUpdate("INSERT INTO professor VALUES(228, '������', '���ν� ������', '010-7643-1034', 'ljw01@gmail.com', 323);");
			stmt.executeUpdate("INSERT INTO professor VALUES(229, '�ۿ���', '����� ������', '010-2561-2324', 'soo@gmail.com', 324);");
			stmt.executeUpdate("INSERT INTO professor VALUES(230, '�ڻ���', 'û�ֽ� ������', '010-3603-0864', 'psl01@daum.net', 325);");

			stmt.executeUpdate("INSERT INTO student VALUES(101, '�輭��', '����� ������', '010-3816-0463', 'ksh@naver.com', '1234-567', 201, 301, 4, 1,313);");
			stmt.executeUpdate("INSERT INTO student VALUES(102, '�ڼ���', '���� ���籸', '010-0543-3170', 'psy@daum.net', '1234-568', 202, 302, 3, 2,314);");
			stmt.executeUpdate("INSERT INTO student VALUES(103, '������', '����� ���ʱ�', '010-5821-2414', 'ljw@naver.com', '1234-569', 203, 303, 2, 1,315);");
			stmt.executeUpdate("INSERT INTO student VALUES(104, '������', '��õ�� ����', '010-8700-1082', 'ysh@daum.net', '1234-570', 204, 304, 1, 2,316);");
			stmt.executeUpdate("INSERT INTO student VALUES(105, '������', 'â���� ���걸', '010-0246-1514', 'lhe@gmail.com', '1234-571', 205, 305, 4, 2,317);");
			stmt.executeUpdate("INSERT INTO student VALUES(106, '������', '����� ��걸', '010-1110-5787', 'cys@naver.com', '1234-572', 206, 306, 3, 1,318);");
			stmt.executeUpdate("INSERT INTO student VALUES(107, '������', 'û�ֽ� ������', '010-5240-2188', 'kju@gamil.com', '1234-573', 207, 307, 2, 1,319);");
			stmt.executeUpdate("INSERT INTO student VALUES(108, '������', '������ �д籸', '010-6671-3610', 'yjm@daum.net', '1234-574', 208, 308, 1, 2,320);");
			stmt.executeUpdate("INSERT INTO student VALUES(109, '��ä��', '����� ���α�', '010-6121-6070', 'kcw@gmail.com', '1234-575', 209, 309, 4, 1,320);");
			stmt.executeUpdate("INSERT INTO student VALUES(110, '�̼���', '��õ�� ��籸', '010-7600-3081', 'isa@naver.com', '1234-576', 210, 310, 3, 1,321);");
			stmt.executeUpdate("INSERT INTO student VALUES(111, '������', '���ν� ���ﱸ', '010-8238-5708', 'sde@daum.net', '1234-577', 211, 311, 2, 2,322);");
			stmt.executeUpdate("INSERT INTO student VALUES(112, '�ڼ���', '����� ������', '010-2584-6803', 'psb@naver.com', '1234-578', 212, 312, 1, 2,323);");
			stmt.executeUpdate("INSERT INTO student VALUES(113, '������', '������ �ȴٱ�', '010-8033-4615', 'jun@gmail.con', '1234-579', 213, 313, 4, 2,324);");
			stmt.executeUpdate("INSERT INTO student VALUES(114, '������', '����� ���ϱ�', '010-4424-0746', 'sub@naver.com', '1234-580', 214, 314, 3, 1,325);");
			stmt.executeUpdate("INSERT INTO student VALUES(115, '�����', '������ ������', '010-7621-3247', 'kmj@daum.net', '1234-581', 215, 315, 2, 1,301);");
			stmt.executeUpdate("INSERT INTO student VALUES(116, '�ڼ���', '�Ȼ�� ��ϱ�', '010-1381-0227', 'psj@gmail.com', '1234-582', 216, 316, 1, 2,302);");
			stmt.executeUpdate("INSERT INTO student VALUES(117, '������', '����� ������', '010-5502-6452', 'dej@gmail.com', '1234-583', 217, 317, 4, 1,303);");
			stmt.executeUpdate("INSERT INTO student VALUES(118, '���ÿ�', '��õ�� ������', '010-1631-5484', 'gsu@daum.net', '1234-584', 218, 318, 3, 1,304);");
			stmt.executeUpdate("INSERT INTO student VALUES(119, '������', '���ؽ� ������', '010-0260-6806', 'chw@gmail.com', '1234-585', 219, 319, 2, 2,305);");
			stmt.executeUpdate("INSERT INTO student VALUES(120, '������', '���ν� ������', '010-5411-7851', 'ljh@naver.com', '1234-586', 220, 320, 1, 2,306);");
			stmt.executeUpdate("INSERT INTO student VALUES(121, '���¹�', '������ �߿���', '010-1383-6282', 'jsm@naver.com', '1234-587', 221, 321, 4, 1,310);");
			stmt.executeUpdate("INSERT INTO student VALUES(122, '������', '����� ���۱�', '010-0885-7326', 'jjh@daum.net', '1234-588', 222, 322, 3, 2,308);");
			stmt.executeUpdate("INSERT INTO student VALUES(123, '����ȯ', '����� ���α�', '010-4406-5116', 'yjh@gmail.com', '1234-589', 223, 323, 2, 1,301);");
			stmt.executeUpdate("INSERT INTO student VALUES(124, '�ӽÿ�', '����� ������', '010-5351-3441', 'lsy@daum.net', '1234-590', 224, 324, 1, 2,302);");
			stmt.executeUpdate("INSERT INTO student VALUES(125, '������', '���ν� ó�α�', '010-1281-5467', 'sec@naver.com', '1234-591', 225, 325, 4, 1,303);");
			stmt.executeUpdate("INSERT INTO student VALUES(126, '�輱��', '����� �߶���', '010-1730-4615', 'afds@google.com', '1234-592', 226, 313, 3, 2,304);");
			stmt.executeUpdate("INSERT INTO student VALUES(127, '������', '��⵵ ������', '010-7711-3536', 'ine@naver.com', '1234-593', 227, 310, 2, 1,305);");
			stmt.executeUpdate("INSERT INTO student VALUES(128, '�輼��', '��⵵ �����', '010-1763-3432', 'asifn@daum.net', '1234-594', 228, 305, 1, 2,306);");
			stmt.executeUpdate("INSERT INTO student VALUES(129, '�ִ���', '����� ���ı�', '010-8445-3777', 'aofnds@google.com', '1234-595', 229, 325, 4, 1,307);");
			stmt.executeUpdate("INSERT INTO student VALUES(130, '��ä��', '��⵵ ���ֽ�', '010-8813-5285', 'boan@naver.com', '1234-596', 230, 324, 3, 1,308);");
			stmt.executeUpdate("INSERT INTO student VALUES(131, '�ǳ���', '��û�� ������', '010-3034-2116', 'onbe@google.com', '1234-597', 201, 301, 2, 2,309);");
			stmt.executeUpdate("INSERT INTO student VALUES(132, '���¹�', '��⵵ �Ȼ��', '010-5319-4418', 'kvre@naver.com', '1234-598', 202, 302, 2, 1,310);");
			stmt.executeUpdate("INSERT INTO student VALUES(133, '������', '������ �����', '010-7429-8450', 'fomea@google.com', '1234-599', 203, 303, 3, 2,311);");
			stmt.executeUpdate("INSERT INTO student VALUES(134, '�ս�ö', '������ �л굿', '010-4465-8194', 'wboie@daum.net', '1234-600', 204, 304, 1, 1,312);");


			stmt.executeUpdate("INSERT INTO class VALUES(401, 1, '�������Ǽ���', '��', 2, 3, 2, 1401, 201, 301);");
			stmt.executeUpdate("INSERT INTO class VALUES(402, 1, '�߱����Թ�', 'ȭ', 7, 4, 3, 1402, 201, 301);");
			stmt.executeUpdate("INSERT INTO class VALUES(403, 1, '�Ϻ����߱�', '��', 2, 3, 3, 1403, 201, 301);");
			stmt.executeUpdate("INSERT INTO class VALUES(404, 1, '�ѱ�����', '��', 7, 4, 3, 1404, 202, 302);");
			stmt.executeUpdate("INSERT INTO class VALUES(405, 1, '�������', '��', 2, 2, 2, 1405, 202, 302);");
			stmt.executeUpdate("INSERT INTO class VALUES(406, 1, '���ƽþư���', '��', 2, 3, 2, 1406, 202, 302);");
			stmt.executeUpdate("INSERT INTO class VALUES(407, 1, '��������Ž��', 'ȭ', 7, 4, 3, 1407, 203, 303);");
			stmt.executeUpdate("INSERT INTO class VALUES(408, 1, '���������', '��', 2, 3, 3, 1408, 203, 303);");
			stmt.executeUpdate("INSERT INTO class VALUES(409, 1, '���������', '��', 7, 4, 3, 1409, 203, 303);");
			stmt.executeUpdate("INSERT INTO class VALUES(410, 1, '��å��', '��', 2, 2, 2, 1410, 204, 304);");
			stmt.executeUpdate("INSERT INTO class VALUES(411, 1, '����������', '��', 2, 3, 2, 1411, 204, 304);");
			stmt.executeUpdate("INSERT INTO class VALUES(412, 1, '����ö�а�����', 'ȭ', 7, 4, 3, 1412, 204, 304);");
			stmt.executeUpdate("INSERT INTO class VALUES(413, 1, '�濵�п���', '��', 2, 3, 3, 1413, 205, 305);");
			stmt.executeUpdate("INSERT INTO class VALUES(414, 1, '����ȸ��', '��', 7, 4, 3, 1414, 205, 305);");
			stmt.executeUpdate("INSERT INTO class VALUES(415, 1, '�繫����', '��', 2, 2, 2, 1415, 205, 305);");
			stmt.executeUpdate("INSERT INTO class VALUES(416, 1, '��������', '��', 2, 3, 2, 1416, 206, 306);");
			stmt.executeUpdate("INSERT INTO class VALUES(417, 1, '���ʰ�������', 'ȭ', 7, 4, 3, 1417, 206, 306);");
			stmt.executeUpdate("INSERT INTO class VALUES(418, 1, '�������', '��', 2, 3, 3, 1418, 206, 306);");
			stmt.executeUpdate("INSERT INTO class VALUES(419, 1, 'ȣ�ڰ������������', '��', 7, 4, 3, 1419, 207, 307);");
			stmt.executeUpdate("INSERT INTO class VALUES(420, 1, '�ܱ������ǽ�', '��', 2, 2, 2, 1420, 207, 307);");
			stmt.executeUpdate("INSERT INTO class VALUES(421, 1, '�ܽİ濵���̳�', '��', 2, 3, 2, 1421, 207, 307);");
			stmt.executeUpdate("INSERT INTO class VALUES(422, 1, '�ؼ��а���', 'ȭ', 7, 4, 3, 1422, 208, 308);");
			stmt.executeUpdate("INSERT INTO class VALUES(423, 1, '���������', '��', 2, 3, 3, 1423, 208, 308);");
			stmt.executeUpdate("INSERT INTO class VALUES(424, 1, '�����', '��', 7, 4, 3, 1424, 208, 308);");
			stmt.executeUpdate("INSERT INTO class VALUES(425, 1, '��������', '��', 2, 2, 2, 1425, 209, 309);");
			stmt.executeUpdate("INSERT INTO class VALUES(426, 1, '�׼�õ����', '��', 2, 3, 2, 1426, 209, 309);");
			stmt.executeUpdate("INSERT INTO class VALUES(427, 1, '���ʰ�����', 'ȭ', 7, 4, 3, 1427, 209, 309);");
			stmt.executeUpdate("INSERT INTO class VALUES(428, 1, '����ȭ��', '��', 2, 3, 3, 1428, 210, 310);");
			stmt.executeUpdate("INSERT INTO class VALUES(429, 1, '�����м�ȭ��', '��', 7, 4, 3, 1429, 210, 310);");
			stmt.executeUpdate("INSERT INTO class VALUES(430, 1, '���м�ȭ��', '��', 2, 2, 2, 1430, 210, 310);");
			stmt.executeUpdate("INSERT INTO class VALUES(431, 1, '�Ϲݻ�����', '��', 2, 3, 2, 1431, 211, 311);");
			stmt.executeUpdate("INSERT INTO class VALUES(432, 1, '����������', 'ȭ', 7, 4, 3, 1432, 211, 311);");
			stmt.executeUpdate("INSERT INTO class VALUES(433, 1, '�Ĺ���Ʈ����������', '��', 2, 3, 3, 1433, 211, 311);");
			stmt.executeUpdate("INSERT INTO class VALUES(434, 1, '����ȸ��', '��', 7, 4, 3, 1434, 212, 312);");
			stmt.executeUpdate("INSERT INTO class VALUES(435, 1, 'Ȯ���׷�������', '��', 2, 2, 2, 1435, 212, 312);");
			stmt.executeUpdate("INSERT INTO class VALUES(436, 1, '�����г�ȸ��', '��', 2, 3, 2, 1436, 212, 312);");
			stmt.executeUpdate("INSERT INTO class VALUES(437, 1, 'C���α׷���', 'ȭ', 7, 4, 3, 1437, 213, 313);");
			stmt.executeUpdate("INSERT INTO class VALUES(438, 1, '�ڷᱸ��', '��', 2, 3, 3, 1438, 213, 313);");
			stmt.executeUpdate("INSERT INTO class VALUES(439, 1, '�����α׷���', '��', 7, 4, 3, 1439, 214, 313);");
			stmt.executeUpdate("INSERT INTO class VALUES(440, 1, '�ΰ�����������', '��', 2, 2, 2, 1440, 215, 314);");
			stmt.executeUpdate("INSERT INTO class VALUES(441, 1, 'JAVA', '��', 2, 3, 2, 1441, 215, 314);");
			stmt.executeUpdate("INSERT INTO class VALUES(442, 1, '�ü��', '��', 7, 4, 3, 1442, 216, 314);");
			stmt.executeUpdate("INSERT INTO class VALUES(443, 1, '��Ʈ��ũ��ŷ������', '��', 2, 3, 3, 1443, 217, 315);");
			stmt.executeUpdate("INSERT INTO class VALUES(444, 1, '������������', 'ȭ', 7, 4, 3, 1444, 217, 315);");
			stmt.executeUpdate("INSERT INTO class VALUES(445, 1, '����Ű��ȣ��', '��', 2, 2, 2, 1445, 218, 315);");
			stmt.executeUpdate("INSERT INTO class VALUES(446, 1, '��Žý���', '��', 2, 3, 2, 1446, 219, 316);");
			stmt.executeUpdate("INSERT INTO class VALUES(447, 1, '����ó��', '��', 7, 4, 3, 1447, 219, 316);");
			stmt.executeUpdate("INSERT INTO class VALUES(448, 1, '�����ý��۸𵨸�', '��', 2, 3, 3, 1448, 220, 316);");
			stmt.executeUpdate("INSERT INTO class VALUES(449, 1, '�ڵ�����', '��', 7, 4, 3, 1449, 221, 317);");
			stmt.executeUpdate("INSERT INTO class VALUES(450, 1, '��ǻ�ͳ�Ʈ��ũ', '��', 2, 2, 2, 1450, 221, 317);");
			stmt.executeUpdate("INSERT INTO class VALUES(451, 1, '��ġ�ؼ�', 'ȭ', 2, 3, 2, 1451, 222, 317);");
			stmt.executeUpdate("INSERT INTO class VALUES(452, 1, 'Ÿ�����׷���', '��', 7, 4, 3, 1452, 223, 318);");
			stmt.executeUpdate("INSERT INTO class VALUES(453, 1, '���ʷ�����', '��', 2, 3, 3, 1453, 223, 318);");
			stmt.executeUpdate("INSERT INTO class VALUES(454, 1, '�����׷���', '��', 7, 4, 3, 1454, 223, 318);");
			stmt.executeUpdate("INSERT INTO class VALUES(455, 1, '�����׽ý���', '��', 2, 2, 2, 1455, 224, 319);");
			stmt.executeUpdate("INSERT INTO class VALUES(456, 1, '�ΰ����ɷ�', '��', 2, 3, 2, 1456, 224, 319);");
			stmt.executeUpdate("INSERT INTO class VALUES(457, 1, '����н�', '��', 7, 4, 3, 1457, 224, 319);");
			stmt.executeUpdate("INSERT INTO class VALUES(458, 1, '���ళ��', 'ȭ', 2, 3, 3, 1458, 225, 320);");
			stmt.executeUpdate("INSERT INTO class VALUES(459, 1, '���м���', '��', 7, 4, 3, 1459, 225, 320);");
			stmt.executeUpdate("INSERT INTO class VALUES(460, 1, '����ǹ�', '��', 2, 2, 2, 1460, 225, 320);");
			stmt.executeUpdate("INSERT INTO class VALUES(461, 1, '���ʼ���', '��', 2, 3, 2, 1461, 226, 321);");
			stmt.executeUpdate("INSERT INTO class VALUES(462, 1, '��ü���', '��', 7, 4, 3, 1462, 226, 321);");
			stmt.executeUpdate("INSERT INTO class VALUES(463, 1, '���������', '��', 2, 3, 3, 1463, 226, 321);");
			stmt.executeUpdate("INSERT INTO class VALUES(464, 1, '���빰��', '��', 7, 4, 3, 1464, 227, 322);");
			stmt.executeUpdate("INSERT INTO class VALUES(465, 1, '��ü����', 'ȭ', 2, 2, 2, 1465, 227, 322);");
			stmt.executeUpdate("INSERT INTO class VALUES(466, 1, '�����ȭ��', '��', 2, 3, 2, 1466, 227, 322);");
			stmt.executeUpdate("INSERT INTO class VALUES(467, 1, '�ι�ȭ', '��', 7, 4, 3, 1467, 228, 323);");
			stmt.executeUpdate("INSERT INTO class VALUES(468, 1, '����ȭ', '��', 2, 3, 3, 1468, 228, 323);");
			stmt.executeUpdate("INSERT INTO class VALUES(469, 1, '��ȭ', '��', 7, 4, 3, 1469, 228, 323);");
			stmt.executeUpdate("INSERT INTO class VALUES(470, 1, '����������', '��', 2, 2, 2, 1470, 229, 324);");
			stmt.executeUpdate("INSERT INTO class VALUES(471, 1, '�۰�������', '��', 2, 3, 2, 1471, 229, 324);");
			stmt.executeUpdate("INSERT INTO class VALUES(472, 1, '�����Ǳ�', 'ȭ', 7, 4, 3, 1472, 229, 324);");
			stmt.executeUpdate("INSERT INTO class VALUES(473, 1, '����', '��', 2, 3, 3, 1473, 230, 325);");
			stmt.executeUpdate("INSERT INTO class VALUES(474, 1, '����ǰ�', '��', 7, 4, 3, 1474, 230, 325);");
			stmt.executeUpdate("INSERT INTO class VALUES(475, 1, '����������', '��', 2, 2, 2, 1475, 230, 325);");

			//attend
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 101, 401, 5, 35, 11, 0, 51, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 102, 402, 10, 34, 29, 0, 73, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 103, 403, 7, 17, 32, 1, 57, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 104, 404, 4, 34, 31, 3, 72, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 105, 405, 6, 14, 17, 8, 45, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 106, 406, 2, 26, 29, 5, 62, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 107, 407, 7, 28, 27, 9, 71, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 108, 408, 2, 26, 18, 5, 51, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 109, 409, 6, 36, 36, 3, 81, 'A', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 110, 410, 3, 33, 38, 6, 80, 'A', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 111, 411, 6, 25, 40, 0, 71, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 112, 412, 7, 21, 17, 5, 50, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 113, 413, 5, 13, 35, 2, 55, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 114, 414, 5, 14, 31, 0, 50, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 115, 415, 3, 13, 27, 9, 52, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 116, 416, 6, 17, 30, 7, 60, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 117, 417, 10, 33, 22, 0, 65, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 118, 418, 9, 18, 13, 7, 47, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 119, 419, 9, 16, 31, 9, 65, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 120, 420, 2, 29, 16, 4, 51, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 121, 421, 10, 34, 25, 10, 79, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 122, 422, 2, 24, 22, 8, 56, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 123, 423, 6, 38, 29, 3, 76, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 124, 424, 8, 29, 29, 0, 66, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 125, 425, 4, 13, 18, 9, 44, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 126, 426, 7, 28, 33, 3, 71, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 127, 427, 5, 24, 30, 7, 66, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 128, 428, 7, 14, 19, 0, 40, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 129, 429, 5, 23, 39, 2, 69, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 130, 430, 2, 38, 17, 6, 63, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 131, 431, 7, 31, 37, 9, 84, 'A', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 132, 432, 10, 15, 24, 9, 58, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 133, 433, 10, 36, 12, 2, 60, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 134, 434, 9, 25, 21, 5, 60, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 101, 435, 10, 38, 23, 6, 77, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 102, 436, 9, 36, 12, 1, 58, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(213, 103, 437, 3, 32, 35, 8, 78, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(213, 104, 438, 2, 25, 17, 0, 44, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(214, 105, 439, 4, 27, 28, 7, 66, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(215, 106, 440, 2, 19, 28, 10, 59, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(215, 107, 441, 7, 27, 22, 5, 61, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(216, 108, 442, 2, 35, 28, 6, 71, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(217, 109, 443, 8, 21, 23, 3, 55, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(217, 110, 444, 2, 17, 39, 2, 60, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(218, 111, 445, 7, 27, 24, 5, 63, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(219, 112, 446, 6, 33, 15, 6, 60, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(219, 113, 447, 6, 28, 36, 6, 76, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(220, 114, 448, 3, 31, 30, 6, 70, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(221, 115, 449, 10, 13, 12, 5, 40, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(221, 116, 450, 9, 26, 20, 8, 63, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(222, 117, 451, 5, 23, 33, 8, 69, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 118, 452, 6, 25, 11, 7, 49, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 119, 453, 6, 31, 25, 7, 69, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 120, 454, 8, 34, 12, 2, 56, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(224, 121, 455, 2, 25, 14, 8, 49, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(224, 122, 456, 5, 21, 37, 4, 67, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(224, 123, 457, 2, 31, 16, 0, 49, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(225, 124, 458, 5, 15, 14, 7, 41, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(225, 125, 459, 6, 13, 39, 7, 65, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(225, 126, 460, 8, 30, 39, 5, 82, 'A', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(226, 127, 461, 6, 11, 35, 7, 59, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(226, 128, 462, 6, 23, 29, 0, 58, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(226, 129, 463, 8, 12, 14, 7, 41, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(227, 130, 464, 4, 36, 23, 7, 70, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(227, 131, 465, 2, 31, 32, 6, 71, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(227, 132, 466, 2, 23, 29, 0, 54, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(228, 133, 467, 2, 30, 21, 3, 56, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(228, 134, 468, 6, 15, 31, 2, 54, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(228, 101, 469, 5, 27, 33, 9, 74, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(229, 102, 470, 5, 17, 16, 7, 45, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(229, 103, 471, 7, 26, 27, 9, 69, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(229, 104, 472, 3, 10, 34, 5, 52, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(230, 105, 473, 3, 34, 17, 1, 55, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(230, 106, 474, 2, 36, 37, 4, 79, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(230, 107, 475, 7, 31, 20, 1, 59, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 108, 401, 8, 14, 13, 5, 40, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 109, 402, 8, 33, 39, 1, 81, 'A', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 110, 403, 3, 29, 32, 0, 64, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 111, 404, 4, 11, 21, 5, 41, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 112, 405, 7, 19, 12, 5, 43, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 113, 406, 9, 36, 29, 4, 78, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 114, 407, 2, 25, 39, 4, 70, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 115, 408, 4, 36, 36, 4, 80, 'A', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 116, 409, 6, 37, 25, 8, 76, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 117, 410, 5, 35, 32, 4, 76, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 118, 411, 5, 16, 18, 1, 40, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 119, 412, 9, 17, 36, 9, 71, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 120, 413, 8, 11, 30, 8, 57, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 121, 414, 4, 29, 14, 8, 55, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 122, 415, 9, 18, 18, 0, 45, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 123, 416, 2, 19, 29, 8, 58, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 124, 417, 8, 19, 33, 8, 68, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 125, 418, 6, 13, 22, 10, 51, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 126, 419, 2, 29, 21, 7, 59, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 127, 420, 6, 31, 21, 2, 60, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 128, 421, 8, 39, 10, 8, 65, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 129, 422, 8, 28, 26, 10, 72, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 130, 423, 5, 22, 11, 3, 41, 'F', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 131, 424, 6, 38, 22, 5, 71, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 132, 425, 6, 23, 36, 2, 67, 'C', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 133, 426, 6, 28, 38, 0, 72, 'B', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 134, 427, 6, 39, 37, 4, 86, 'A', 2020, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 101, 428, 6, 14, 34, 1, 55, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 102, 429, 10, 40, 39, 2, 91, 'A', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 103, 430, 2, 35, 35, 6, 78, 'B', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 104, 431, 5, 11, 27, 5, 48, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 105, 432, 7, 32, 24, 8, 71, 'B', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 106, 433, 6, 12, 36, 8, 62, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 107, 434, 8, 29, 38, 9, 84, 'A', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 108, 435, 4, 35, 38, 7, 84, 'A', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 109, 436, 10, 10, 33, 10, 63, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(213, 110, 437, 10, 11, 28, 6, 55, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(213, 111, 438, 2, 36, 32, 3, 73, 'B', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(214, 112, 439, 9, 27, 16, 0, 52, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(215, 113, 440, 8, 37, 28, 4, 77, 'B', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(215, 114, 441, 9, 12, 16, 3, 40, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(216, 115, 442, 8, 29, 30, 5, 72, 'B', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(217, 116, 443, 5, 10, 22, 8, 45, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(217, 117, 444, 10, 10, 17, 4, 41, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(218, 118, 445, 10, 18, 29, 4, 61, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(219, 119, 446, 10, 26, 21, 0, 57, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(219, 120, 447, 5, 36, 39, 3, 83, 'A', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(220, 121, 448, 2, 21, 21, 2, 46, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(221, 122, 449, 3, 27, 20, 5, 55, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(221, 123, 450, 9, 34, 39, 6, 88, 'A', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(222, 124, 451, 8, 17, 12, 9, 46, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 125, 452, 2, 29, 40, 2, 73, 'B', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 126, 453, 3, 38, 25, 6, 72, 'B', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 127, 454, 7, 29, 27, 3, 66, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(224, 128, 455, 2, 16, 11, 0, 29, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(224, 129, 456, 7, 34, 33, 10, 84, 'A', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(224, 130, 457, 10, 27, 18, 2, 57, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(225, 131, 458, 2, 33, 22, 9, 66, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(225, 132, 459, 8, 10, 14, 2, 34, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(225, 133, 460, 10, 10, 32, 5, 57, 'C', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(226, 134, 461, 7, 12, 19, 10, 48, 'F', 2020, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(226, 101, 462, 4, 19, 22, 5, 50, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(226, 102, 463, 6, 16, 20, 5, 47, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(227, 103, 464, 6, 18, 19, 0, 43, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(227, 104, 465, 9, 20, 12, 8, 49, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(227, 105, 466, 6, 39, 31, 4, 80, 'A', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(228, 106, 467, 4, 39, 17, 3, 63, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(228, 107, 468, 7, 17, 36, 2, 62, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(228, 108, 469, 2, 18, 20, 9, 49, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(229, 109, 470, 2, 12, 21, 4, 39, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(229, 110, 471, 10, 27, 12, 10, 59, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(229, 111, 472, 6, 18, 23, 6, 53, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(230, 112, 473, 2, 38, 36, 7, 83, 'A', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(230, 113, 474, 4, 12, 20, 5, 41, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(230, 114, 475, 5, 29, 37, 10, 81, 'A', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 115, 401, 7, 21, 13, 2, 43, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 116, 402, 4, 24, 35, 8, 71, 'B', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(201, 117, 403, 9, 19, 40, 9, 77, 'B', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 118, 404, 6, 22, 20, 2, 50, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 119, 405, 4, 39, 37, 7, 87, 'A', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(202, 120, 406, 2, 20, 30, 8, 60, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 121, 407, 9, 13, 10, 5, 37, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 122, 408, 8, 14, 38, 5, 65, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(203, 123, 409, 7, 18, 11, 4, 40, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 124, 410, 8, 35, 24, 8, 75, 'B', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 125, 411, 5, 36, 36, 7, 84, 'A', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(204, 126, 412, 9, 29, 27, 0, 65, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 127, 413, 7, 19, 25, 4, 55, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 128, 414, 3, 12, 18, 4, 37, 'F', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(205, 129, 415, 7, 22, 20, 3, 52, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 130, 416, 9, 33, 36, 3, 81, 'A', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 131, 417, 3, 31, 10, 6, 50, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(206, 132, 418, 5, 22, 20, 3, 50, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 133, 419, 3, 28, 12, 8, 51, 'C', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 134, 420, 4, 31, 33, 2, 70, 'B', 2019, 2);");
			stmt.executeUpdate("INSERT INTO attend VALUES(207, 101, 421, 10, 30, 24, 9, 73, 'B', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 102, 422, 10, 31, 35, 0, 76, 'B', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 103, 423, 6, 37, 25, 10, 78, 'B', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(208, 104, 424, 7, 12, 33, 3, 55, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 105, 425, 8, 28, 15, 4, 55, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 106, 426, 2, 40, 23, 8, 73, 'B', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(209, 107, 427, 7, 31, 38, 6, 82, 'A', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 108, 428, 4, 36, 28, 8, 76, 'B', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 109, 429, 5, 20, 20, 7, 52, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(210, 110, 430, 4, 23, 18, 2, 47, 'F', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 111, 431, 3, 29, 20, 0, 52, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 112, 432, 6, 16, 20, 2, 44, 'F', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(211, 113, 433, 9, 10, 31, 3, 53, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 114, 434, 7, 23, 26, 7, 63, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 115, 435, 7, 18, 29, 10, 64, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(212, 116, 436, 2, 29, 40, 10, 81, 'A', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(213, 117, 437, 3, 34, 27, 3, 67, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(213, 118, 438, 7, 19, 38, 9, 73, 'B', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(214, 119, 439, 9, 17, 10, 10, 46, 'F', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(215, 120, 440, 9, 17, 37, 8, 71, 'B', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(215, 121, 441, 7, 23, 10, 7, 47, 'F', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(216, 122, 442, 8, 22, 23, 7, 60, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(217, 123, 443, 3, 12, 37, 5, 57, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(217, 124, 444, 4, 30, 21, 10, 65, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(218, 125, 445, 8, 32, 10, 5, 55, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(219, 126, 446, 10, 29, 24, 4, 67, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(219, 127, 447, 3, 19, 15, 10, 47, 'F', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(220, 128, 448, 4, 15, 25, 8, 52, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(221, 129, 449, 4, 33, 29, 8, 74, 'B', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(221, 130, 450, 7, 27, 31, 4, 69, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(222, 131, 451, 7, 22, 19, 10, 58, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 132, 452, 2, 28, 19, 2, 51, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 133, 453, 2, 39, 19, 3, 63, 'C', 2019, 1);");
			stmt.executeUpdate("INSERT INTO attend VALUES(223, 134, 454, 4, 36, 27, 9, 76, 'B', 2019, 1);");

			//tution
			stmt.executeUpdate("INSERT INTO tuition VALUES(101, 2020, 2, 150000, 150000, '2020-09-13');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(102, 2020, 2, 350000, 300000, '2020-09-13');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(103, 2020, 2, 300000, 300000, '2020-07-31');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(104, 2020, 2, 250000, 250000, '2020-08-12');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(105, 2020, 2, 150000, 0, '2020-03-28');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(106, 2020, 2, 350000, 350000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(107, 2020, 2, 300000, 300000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(108, 2020, 2, 250000, 250000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(109, 2020, 2, 150000, 150000, '2020-08-27');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(110, 2020, 2, 350000, 200000, '2020-08-27');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(111, 2020, 2, 300000, 300000, '2020-08-27');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(112, 2020, 2, 250000, 250000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(113, 2020, 2, 150000, 150000, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(114, 2020, 2, 350000, 350000, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(115, 2020, 2, 300000, 300000, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(116, 2020, 2, 250000, 220000, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(117, 2020, 2, 150000, 150000, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(118, 2020, 2, 350000, 350000, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(119, 2020, 2, 300000, 300000, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(120, 2020, 2, 250000, 0, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(121, 2020, 2, 150000, 100000, '2020-09-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(122, 2020, 2, 350000, 350000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(123, 2020, 2, 300000, 300000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(124, 2020, 2, 250000, 250000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(125, 2020, 2, 150000, 150000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(126, 2020, 2, 350000, 350000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(127, 2020, 2, 300000, 250000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(128, 2020, 2, 250000, 250000, '2020-08-21');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(129, 2020, 2, 150000, 150000, '2020-08-21');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(130, 2020, 2, 350000, 300000, '2020-08-21');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(131, 2020, 2, 300000, 280000, '2020-08-21');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(132, 2020, 2, 300000, 300000, '2020-08-21');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(133, 2020, 2, 350000, 300000, '2020-08-15');");
			stmt.executeUpdate("INSERT INTO tuition VALUES(134, 2020, 2, 250000, 250000, '2020-08-15');");

			stmt.executeUpdate("INSERT INTO club VALUES(501, '�౸', 2, 1501, 201, 101);");
			stmt.executeUpdate("INSERT INTO club VALUES(502, '�߱�', 2, 1502, 202, 102);");
			stmt.executeUpdate("INSERT INTO club VALUES(503, '��', 2, 1503, 203, 103);");
			stmt.executeUpdate("INSERT INTO club VALUES(504, '��Ű', 2, 1504, 204, 104);");
			stmt.executeUpdate("INSERT INTO club VALUES(505, '�豸', 2, 1505, 205, 105);");
			stmt.executeUpdate("INSERT INTO club VALUES(506, '����', 2, 1506, 206, 106);");
			stmt.executeUpdate("INSERT INTO club VALUES(507, '�⵶��', 2, 1507, 207, 107);");
			stmt.executeUpdate("INSERT INTO club VALUES(508, '�ұ�', 2, 1508, 208, 108);");
			stmt.executeUpdate("INSERT INTO club VALUES(509, 'õ�ֱ�', 2, 1509, 209, 109);");
			stmt.executeUpdate("INSERT INTO club VALUES(510, '���', 2, 1510, 210, 110);");
			stmt.executeUpdate("INSERT INTO club VALUES(511, '�ڵ�', 2, 1511, 211, 111);");
			stmt.executeUpdate("INSERT INTO club VALUES(512, '����', 2, 1512, 212, 112);");
			stmt.executeUpdate("INSERT INTO club VALUES(513, '����', 2, 1513, 213, 113);");
			stmt.executeUpdate("INSERT INTO club VALUES(514, '������', 1, 1514, 214, 114);");
			stmt.executeUpdate("INSERT INTO club VALUES(515, '����', 1, 1515, 215, 115);");
			stmt.executeUpdate("INSERT INTO club VALUES(516, '�������', 1, 1516, 216, 116);");
			stmt.executeUpdate("INSERT INTO club VALUES(517, '������', 1, 1517, 217, 117);");
			stmt.executeUpdate("INSERT INTO club VALUES(518, '������', 1, 1518, 218, 118);");
			stmt.executeUpdate("INSERT INTO club VALUES(519, '�籸', 1, 1519, 219, 119);");
			stmt.executeUpdate("INSERT INTO club VALUES(520, '��', 1, 1520, 220, 120);");
			stmt.executeUpdate("INSERT INTO club VALUES(521, '����', 1, 1521, 221, 121);");
			stmt.executeUpdate("INSERT INTO club VALUES(522, '�������', 1, 1522, 222, 122);");
			stmt.executeUpdate("INSERT INTO club VALUES(523, '����', 1, 1523, 223, 123);");
			stmt.executeUpdate("INSERT INTO club VALUES(524, 'Ŭ����', 1, 1524, 224, 124);");
			stmt.executeUpdate("INSERT INTO club VALUES(525, '��ȭ', 1, 1525, 225, 125);");

			stmt.executeUpdate("INSERT INTO studentclub VALUES(101, 501);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(102, 502);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(103, 503);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(104, 504);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(105, 505);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(106, 506);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(107, 507);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(108, 508);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(109, 509);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(110, 510);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(111, 511);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(112, 512);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(113, 513);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(114, 514);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(115, 515);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(116, 516);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(117, 517);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(118, 518);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(119, 519);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(120, 520);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(121, 521);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(122, 522);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(123, 523);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(124, 524);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(125, 525);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(126, 501);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(127, 502);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(128, 503);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(129, 504);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(130, 505);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(131, 506);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(132, 507);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(133, 508);");
			stmt.executeUpdate("INSERT INTO studentclub VALUES(134, 509);");

		}
		catch (Exception e2) {
			System.out.println("���̺� �Է� ���� :" + e2);
		}
	}

	class JPanel01 extends JPanel{
		JButton btnReset, btnInput, btnDeleteAlter, btnTable;
		JTextArea txtResult;
		JPanel pn1;
		MyAdminInsert1 dialog1;
		MyAdminInsert2 dialog2;
		MyAdminInsert3 dialog3;
		MyAdminInsert4 dialog4;
		MyAdminInsert5 dialog5;
		MyAdminInsert6 dialog6;
		MyAdminInsert7 dialog7;
		MyAdminInsert8 dialog8;


		public JPanel01() {
			btnTable = new JButton("��� ���̺���");
			btnReset = new JButton("�ʱ�ȭ");
			btnInput = new JButton("�Է�");
			btnDeleteAlter = new JButton("����/����");

			dialog1 = new MyAdminInsert1(this, "test");
			dialog2 = new MyAdminInsert2(this, "test");
			dialog3 = new MyAdminInsert3(this, "test");
			dialog4 = new MyAdminInsert4(this, "test");
			dialog5 = new MyAdminInsert5(this, "test");
			dialog6 = new MyAdminInsert6(this, "test");
			dialog7 = new MyAdminInsert7(this, "test");
			dialog8 = new MyAdminInsert8(this, "test");


			pn1 = new JPanel();
			pn1.add(btnTable);
			pn1.add(btnInput);
			pn1.add(btnDeleteAlter);
			pn1.add(btnReset);

			txtResult = new JTextArea(20,90);
			txtResult.setEditable(false);
			JScrollPane scrollPane = new JScrollPane(txtResult);
			add("North", pn1);//��������
			add("Center", scrollPane);	

			btnReset.addActionListener(new MybtnReset());
			btnTable.addActionListener(new MyTable());
			btnInput.addActionListener(new MybtnInput());
			btnDeleteAlter.addActionListener(new MyDeleteAlter());
		}
		//������ ����/����
		class MyDeleteAlter implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				try {
					txtResult.setText("");
					stmt = con.createStatement();
					String DeleteAlter = JOptionPane.showInputDialog("����/���� SQL���� �Է��Ͻÿ�.");
					stmt.executeUpdate(DeleteAlter);
					txtResult.setText("SQL���� �Ϸ�");
				}
				catch (Exception e2) {
					txtResult.setText("");
					System.out.println("SQL���� ���� :" + e2);
					txtResult.setText("�Է��� �߸��Ǿ����ϴ�.\n"+e2);
				}
			}	   }

		//������ ����
		class MybtnInput implements ActionListener{
			String [] input = new String [15];
			public void actionPerformed(ActionEvent e) {
				try {
					stmt = con.createStatement();
					if (e.getSource() == btnInput) 
					{
						String []tb = {"student", "professor", "dempartment", "class", "club", "studentclub", "tuition" , "attend"};
						Object selected = JOptionPane.showInputDialog(null, "���̺� �Է�", "input", JOptionPane.QUESTION_MESSAGE, null, tb, tb[0]);
						if(selected == tb[0])
						{
							dialog1.setVisible(true);
							for(int i=0; i<dialog1.returnSize(); i++)
								input[i] = dialog1.getInput(i);
							//String query = "INSERT INTO student VALUES(101, '�輭��', '����� ������', '010-3816-0463', 'ksh@naver.com', 1234567, 201, 301, 4, 1,313)";
							String query = "INSERT INTO student VALUES("+input[0]+", '"+input[1]+"', '"+input[2]+"', '"+input[3]+"', '"+input[4]+"', "+input[5]+", "+input[6]+", "+input[7]+", "+input[8]+", "+input[9]+","+input[10]+")";
							stmt.executeUpdate(query); 
							txtResult.append(query);
							txtResult.append("\n�Է��� �Ϸ��Ͽ����ϴ�.\n");
						}
						else if(selected == tb[1]) 
						{
							dialog2.setVisible(true);
							for(int i=0; i<dialog2.returnSize(); i++)
								input[i] = dialog2.getInput(i);

							//String query = "INSERT INTO professor VALUES(201, '������', '���ν� ó�α�', '010-2406-8472', 'ksk01@gmail.com', 301);";
							String query = "INSERT INTO professor VALUES("+input[0]+", '"+input[1]+"', '"+input[2]+"', '"+input[3]+"', '"+input[4]+"', "+input[5]+")";

							stmt.executeUpdate(query); 
							txtResult.append(query);
							txtResult.append("\n�Է��� �Ϸ��Ͽ����ϴ�.\n");
						}
						else if(selected == tb[2]) 
						{
							dialog3.setVisible(true);
							for(int i=0; i<dialog3.returnSize(); i++)
								input[i] = dialog3.getInput(i);

							//String query = "INSERT INTO department VALUES(301, '�����а�', '02-2322-2315', '������', '������');";
							String query = "INSERT INTO department VALUES("+input[0]+", '"+input[1]+"', '"+input[2]+"', '"+input[3]+"', '"+input[4]+")";

							stmt.executeUpdate(query); 
							txtResult.append(query);
							txtResult.append("\n�Է��� �Ϸ��Ͽ����ϴ�.\n");
						}
						else if(selected == tb[3]) 
						{
							dialog4.setVisible(true);
							for(int i=0; i<dialog4.returnSize(); i++)
								input[i] = dialog4.getInput(i);

							//String query = "INSERT INTO class VALUES(401, 1, '�������Ǽ���', '��', 2, 3, 2, 1401, 201, 301);";
							String query = "INSERT INTO class VALUES("+input[0]+", "+input[1]+", '"+input[2]+"', '"+input[3]+"', "+input[4]+", "+input[5]+", "
									+input[6]+", "+input[7]+", "+input[8]+", "+input[9]+")";

							stmt.executeUpdate(query); 
							txtResult.append(query);
							txtResult.append("\n�Է��� �Ϸ��Ͽ����ϴ�.\n");
						}
						else if(selected == tb[4])//club
						{
							dialog5.setVisible(true);
							for(int i=0; i<dialog5.returnSize(); i++)
								input[i] = dialog5.getInput(i);

							//String query = "INSERT INTO club VALUES(501, '�౸', 2, 1501, 201, 101);";
							String query = "INSERT INTO club VALUES("+input[0]+", '"+input[1]+"', "+input[2]+", "+input[3]+", "+input[4]+", "+input[5]+")";

							stmt.executeUpdate(query); 
							txtResult.append(query);
							txtResult.append("\n�Է��� �Ϸ��Ͽ����ϴ�.\n");
						}
						else if(selected == tb[5]) //studentclub
						{

							dialog6.setVisible(true);
							for(int i=0; i<dialog6.returnSize(); i++)
								input[i] = dialog6.getInput(i);

							//String query = "INSERT INTO studentclub VALUES(101, 501);";
							String query = "INSERT INTO studentclub VALUES("+input[0]+", "+input[1]+")";

							stmt.executeUpdate(query);
							txtResult.append(query);
							txtResult.append("\n�Է��� �Ϸ��Ͽ����ϴ�.\n");
						}
						else if(selected == tb[6]) //tuition
						{
							dialog7.setVisible(true);
							for(int i=0; i<dialog7.returnSize(); i++)
								input[i] = dialog7.getInput(i);

							//String query = "INSERT INTO tuition VALUES(101, 2020, 2, 150000, 150000, '2020-09-13');";
							String query = "INSERT INTO tuition VALUES("+input[0]+", "+input[1]+", "+input[2]+", "+input[3]+", "+input[4]+", '"+input[5]+"')";

							stmt.executeUpdate(query);
							txtResult.append(query);
							txtResult.append("\n�Է��� �Ϸ��Ͽ����ϴ�.\n");
						}
						else if(selected == tb[7]) //attend
						{
							dialog8.setVisible(true);
							for(int i=0; i<dialog8.returnSize(); i++)
								input[i] = dialog8.getInput(i);
							int total =1, payed=-1;
							//String query = "INSERT INTO attend VALUES(201, 101, 401, 5, 35, 11, 0, 51, 'C', 2020, 2);";
							String query2 = "select totalTuition, payTuition from tuition where student="+input[1];
							rs = stmt.executeQuery(query2);
							while(rs.next()) {
								total = rs.getInt(1);
								payed = rs.getInt(2);
							}
							txtResult.setText("");
							if(total<=payed) {
								String query1 = "INSERT INTO attend VALUES("+input[0]+", "+input[1]+", "+input[2]+", "+input[3]+", "+input[4]
										+", "+input[5]+", "+input[6]+", "+input[7]+", '"+input[8]+"', "+input[9]+","+input[10]+")";
								stmt.executeUpdate(query1);
								txtResult.append(query1);
								txtResult.append("\n�Է��� �Ϸ��Ͽ����ϴ�.\n");
							}
							else if(payed!=-1)
							{
								txtResult.append("��ϱ� �̳�");
								JOptionPane.showMessageDialog(null,  "��ϱ� �̳�");
							}
						}


					} 
				} catch (Exception e2) {
					System.out.println("������ �Է� ���� :" + e2);
				}
			}
		}
		//���̺� �ʱ�ȭ
		class MybtnReset implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == btnReset) 
					{
						createTable();
						txtResult.setText("8�� ���̺��� �����Ͱ� �ʱ�ȭ �Ǿ����ϴ�.");
					} 
				} catch (Exception e2) {
					System.out.println("������ �ʱ�ȭ ���� :" + e2);
				}
			}
		}
		//��� ���̺� �����ֱ�
		class MyTable implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				try {
					stmt = con.createStatement();
					String query1,query2,query3,query4,query5,query6,query7,query8;
					if (e.getSource() == btnTable) 
					{
						query1 = "SELECT * FROM student";
						txtResult.setText("");
						txtResult.append("[Student ���̺�]\n");
						txtResult.append("idStudent     name           address              phoneNum    	 email             account	mprofessor	mDepartment	schoolYear  studentSemester  subMajor\n");
						rs = stmt.executeQuery(query1); 
						while (rs.next()) {
							String str1 = rs.getInt(1) +"                "+  rs.getString(2) + "      "+ rs.getString(3)+  "      "+ rs.getString(4)+ "      "+ rs.getString(5)+"      "+  rs.getString(6) +"\t"+
									rs.getInt(7) + "   \t "+ rs.getInt(8) +"\t "+ rs.getInt(9)+ "\t"+rs.getInt(10) + "\t "+rs.getInt(11)+ "\n";
							txtResult.append(str1);
						}
						query2 = "SELECT * FROM professor";
						txtResult.append("[Professor ���̺�]\n");
						txtResult.append("idProfessor     name           address              phoneNum    	 email            department\n");
						rs = stmt.executeQuery(query2); 
						while (rs.next()) {
							String str2 = rs.getInt(1) +"                "+  rs.getString(2) + "      "+ rs.getString(3)+  "      "+ rs.getString(4)+ "      "+ rs.getString(5)+
									"      "+  rs.getInt(6) +"\t"+ "\n";
							txtResult.append(str2);
						}
						query3 = "SELECT * FROM department";
						txtResult.append("[Department ���̺�]\n");
						txtResult.append("idDepartment     name         	     phoneNum                 address   mProfessor\n");
						rs = stmt.executeQuery(query3); 
						while (rs.next()) {
							String str3 = rs.getInt(1) +"\t "+  rs.getString(2) + "                  "+ rs.getString(3)+  "            "+ rs.getString(4)+ "            "+
									rs.getString(5)+"\n";
							txtResult.append(str3);
						}
						query4 = "SELECT * FROM class";
						txtResult.append("[Class ���̺�]\n");
						txtResult.append("idClass   sClass                 name                 week           timeOfStart     credit     time          room      professor     openDepartment\n");
						rs = stmt.executeQuery(query4);  
						while (rs.next()) {
							String str4 = rs.getInt(1) +"                "+  rs.getInt(2) + "                "+ rs.getString(3)+  "                "+ rs.getString(4)+ "                "+ rs.getInt(5)+"                "+  rs.getInt(6) +"                "+
									rs.getInt(7) + "                "+ rs.getInt(8) +"                "+ rs.getInt(9)+ "                "+rs.getInt(10) + "\n";
							txtResult.append(str4);
						}
						query5 = "SELECT * FROM club";
						txtResult.append("[Club ���̺�]\n");
						txtResult.append("idClub  	 name	numStudent	room	cProfessor	pStudent\n");
						rs = stmt.executeQuery(query5);  
						while (rs.next()) {
							String str5 = rs.getInt(1) +"\t"+  rs.getString(2) + "\t"+ rs.getInt(3)+  "\t"+ rs.getInt(4)+ "\t"+ rs.getInt(5)+"\t"+  rs.getInt(6) +"\n";
							txtResult.append(str5);
						}
						query6 = "SELECT * FROM studentclub";
						txtResult.append("[Studentclub ���̺�]\n");
						txtResult.append("idStudent	idClub\n");
						rs = stmt.executeQuery(query6);  
						while (rs.next()) {
							String str6 = rs.getInt(1) +"\t"+  rs.getInt(2) +"\n";
							txtResult.append(str6);
						}
						query7 = "SELECT * FROM tuition";
						txtResult.append("[Tuition ���̺�]\n");
						txtResult.append("student	yTuition	sTuition	totalTuition	payTuition	lastDate\n");
						rs = stmt.executeQuery(query7);  
						while (rs.next()) {
							String str7 =  rs.getInt(1) +"\t"+  rs.getInt(2) + "\t"+ rs.getInt(3)+  "\t"+ rs.getInt(4)+ "\t"+ rs.getInt(5)+"\t"+  rs.getDate(6) +"\n";
							txtResult.append(str7);
						}
						query8 = "SELECT * FROM attend";
						txtResult.append("[Attend ���̺�]\n");
						txtResult.append("idProfessor	idStudent	idClass	attendPoint	midPoint	finalPoint	elsePoint	total	grade	year	semester\n");
						rs = stmt.executeQuery(query8);  
						while (rs.next()) {
							String str8 =  rs.getInt(1) +"\t"+  rs.getInt(2) + "\t"+ rs.getInt(3)+  "\t"+ rs.getInt(4)+ "\t"+ rs.getInt(5)+"\t"+  rs.getInt(6) +"\t"+
									rs.getInt(7) + "\t"+ rs.getInt(8) +"\t"+ rs.getString(9)+ "\t"+rs.getInt(10)+ "\t" + rs.getInt(11)+"\n";
							txtResult.append(str8);
						}
					}
				} catch (Exception e2) {
					System.out.println("������ ��ȸ ���� :" + e2);
				}
			}
		}

	}


	//������
	class JPanel02 extends JPanel{
		JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;
		JTextArea txtResult;
		JPanel pn1;
		MyproTable dialog = new MyproTable(jp2, Driver);
		MyproTable2 dialog2 = new MyproTable2(jp2, Driver);
		MyproTable3 dialog3 = new MyproTable3(jp2, Driver);

		public JPanel02() {

			btn1 = new JButton("���ǰ��� ����");
			btn2 = new JButton("�����л� ����");
			btn3 = new JButton("�Ҽ��а� ����");
			btn4 = new JButton("���б� ����ð�ǥ");
			btn5 = new JButton("���ǰ��� �����Է�");
			btn6 = new JButton("�����л� ������ȸ");
			btn7 = new JButton("���� �����л� ����");

			pn1 = new JPanel();
			pn1.add(btn1);
			pn1.add(btn7);
			pn1.add(btn2);
			pn1.add(btn6);
			pn1.add(btn3);
			pn1.add(btn4);
			pn1.add(btn5);

			txtResult = new JTextArea(20,90);
			txtResult.setEditable(false);
			JScrollPane scrollPane = new JScrollPane(txtResult);
			add("North", pn1);//��������
			add("Center", scrollPane);	

			btn1.addActionListener(new Mybtn());
			btn2.addActionListener(new Mybtn());
			btn3.addActionListener(new Mybtn());
			btn4.addActionListener(new Mybtn());
			btn5.addActionListener(new Mybtn());
			btn6.addActionListener(new Mybtn());
			btn7.addActionListener(new Mybtn());
		}
		class Mybtn implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == btn1) {			
						stmt = con.createStatement();
						dialog.setVisible(true);

						String prid = dialog.getInputI();
						String year = dialog.getInputY();
						String semester = dialog.getInputS();

						String query1;

						query1 = "select * from class where professor in (select idProfessor  from attend where idProfessor = "+ prid +" and year = "+ year + " and semester = "+semester+")";

						txtResult.setText("");
						txtResult.append(prid+"������  [CLASS ���̺�]\n");
						txtResult.append("���¹�ȣ"+ "\t"+"�йݹ�ȣ"+"\t"+"�����̸�"+"\t"+"���ǿ���"+"\t"+"���Ǳ���"+"\t"+"����"+"\t"+"���½ð�"+"\t"+"���ǽ�"+"\t"+"���� ����"+"\t"+"���� �а�"+"\n");
						rs = stmt.executeQuery(query1);
						while (rs.next()) {
							String str1 = rs.getInt(1) +"\t"+  rs.getString(2) + "\t"+ rs.getString(3)+  "\t"+ rs.getString(4)+ "\t"+ rs.getString(5)+"\t"+  rs.getString(6) +"\t"+
									rs.getInt(7) + "\t "+ rs.getInt(8) +"\t"+ rs.getInt(9)+ "\t"+rs.getInt(10)+ "\n";
							txtResult.append(str1);
						}
					}
					else if(e.getSource()==btn7)
					{
						String selected = JOptionPane.showInputDialog("���ǹ�ȣ�� �Է��ϼ���");
						txtResult.append(selected+"���� �����л��� ����\n");
						stmt = con.createStatement();
						String query3;	
						query3 = "select student.* from student, attend where student.idStudent=attend.idStudent and idClass= "+selected;
						txtResult.setText("");
						txtResult.append(selected+"������  [�����л� ���̺�]\n");
						txtResult.append("�л���ȣ"+ "\t"+"�̸�"+"\t"+"�ּ�"+"\t"+"����ȣ"+"\t"+"�̸���"+"\t"+"����"+"\t"+"��������"+"\t"+"�а�"+"\t"+"�г�"+"\t"+"�б�"+"\t������"+"\n");
						rs = stmt.executeQuery(query3); 
						while (rs.next()) {
							String str1 = rs.getInt(1) +"\t"+  rs.getString(2) + "\t"+ rs.getString(3)+  "\t"+ rs.getString(4)+ "\t"+ rs.getString(5)+""+  rs.getString(6) +"\t"+
									rs.getInt(7) + "\t "+ rs.getInt(8) +"\t"+ rs.getInt(9)+ "\t"+rs.getInt(10) +"\t"+ rs.getInt(11)+"\n";
							txtResult.append(str1);

						}

					}
					else if (e.getSource() == btn2) {
						stmt = con.createStatement();
						dialog2.setVisible(true);

						String prid = dialog2.getInputI();
						String query3;	
						query3 = "select student.* from student, professor where student.mProfessor = professor.idProfessor and idProfessor = "+prid+";";
						txtResult.setText("");
						txtResult.append(prid+"������  [CLASS ���̺�]\n");
						txtResult.append("�л���ȣ"+ "\t"+"�̸�"+"\t"+"�ּ�"+"\t"+"����ȣ"+"\t"+"�̸���"+"\t"+"����"+"\t"+"��������"+"\t"+"�а�"+"\t"+"�г�"+"\t"+"�б�"+"\t������"+"\n");
						rs = stmt.executeQuery(query3); 
						while (rs.next()) {
							String str1 = rs.getInt(1) +"\t"+  rs.getString(2) + "\t"+ rs.getString(3)+  "\t"+ rs.getString(4)+ "\t"+ rs.getString(5)+""+  rs.getString(6) +"\t"+
									rs.getInt(7) + "\t "+ rs.getInt(8) +"\t"+ rs.getInt(9)+ "\t"+rs.getInt(10) +"\t"+ rs.getInt(11)+"\n";
							txtResult.append(str1);

						}
					}
					else if (e.getSource() == btn3) {
						stmt = con.createStatement();
						dialog2.setVisible(true);  
						String prid = dialog2.getInputI();
						String query1;	
						query1 = "select idDepartment, department.name, department.phoneNumber, department.address, department.mProfessor from department,professor where department.idDepartment = professor.department and idProfessor = " + prid+ ";";
						txtResult.setText("");
						txtResult.append(prid+"������  [�а� ���̺�]\n");
						txtResult.append("�а���ȣ"+ "\t"+"�а��̸�"+"\t"+"��ȣ"+"\t"+"�ּ�"+"\t"+"�а���"+"\n");
						rs = stmt.executeQuery(query1); 
						while (rs.next()) {
							String str1 = rs.getInt(1) +"\t"+  rs.getString(2) + "\t"+ rs.getString(3)+  "\t"+ rs.getString(4)+ "\t"+ rs.getString(5)+"\t"+ "\n";
							txtResult.append(str1);

						}
					}
					else if(e.getSource()==btn4) {//�����ð�ǥ
						stmt = con.createStatement();
						dialog.setVisible(true);
						char [] week = {'��', 'ȭ', '��', '��', '��', '��'};
						String id = dialog.getInputI();
						String year = dialog.getInputY();
						String semester = dialog.getInputS();

						String query2;
						String classname=null;
						int startTime=11;
						int endTime=11;
						char classWeek = 0;
						//query2 = "select * from class where idClass in (select idClass from attend where idStudent = "+ id +" and year = "+ year + " and semester = "+semester+")";

						txtResult.setText("");
						txtResult.append(id+"������ "+year+"�� "+semester+"�б� [�ð�ǥ ���̺�]\n");
						txtResult.append("����"+ "\t"+"������"+"\t"+"ȭ����"+"\t"+"������"+"\t"+"�����"+"\t"+"�ݿ���"+"\t�����\n");

						for(int i=1; i<=10; i++)
						{
							txtResult.append(i+"����\t");
							for(int j=1; j<7; j++)
							{
								query2 = "select name, timeOfStart, time, week from class where idClass in (select idClass from attend where idProfessor = "+id+ " and year = " +year+ " and semester = " + semester +" and week = '"+week[j-1]+"')";
								rs = stmt.executeQuery(query2); 

								if(rs.next())
								{
									classname = rs.getString(1);
									startTime = rs.getInt(2);
									endTime = rs.getInt(3);
									String DWeek = rs.getString(4);
									classWeek = DWeek.charAt(0);
								}
								if(i>=startTime&&i<=(startTime+endTime)&&(classWeek==week[j-1]))
								{
									txtResult.append(classname);
								}
								txtResult.append("\t");
							}
							txtResult.append("\n");;
						}
					}
					else if (e.getSource() == btn5) { 
						int flag = 0;
						dialog3.setVisible(true); 
						int prid = Integer.parseInt(dialog3.getidprofessor()); int idst = Integer.parseInt(dialog3.getidst());;
						int idclass =  Integer.parseInt(dialog3.getidclass()); int attend =  Integer.parseInt(dialog3.getattend());
						int mid =  Integer.parseInt(dialog3.getmidI()); int  finalp =  Integer.parseInt(dialog3.getfinalp());
						int elsep =  Integer.parseInt(dialog3.getelsep()); int total =  Integer.parseInt(dialog3.gettotalI());
						String grade = dialog3.getgrade();
						String query = "select idclass from class where professor = "+ prid; 
						rs = stmt.executeQuery(query); 
						while (rs.next()) {
							int str1 = rs.getInt(1);
							if(str1 == idclass) 
								flag = 1;
						}
						if(flag == 1) {
							String queryinsert = "INSERT INTO attend VALUES(?,?,?,?,?,?,?,?,?,2020,2)";
							pstmt = con.prepareStatement(queryinsert); 
							pstmt.setInt(1, prid);pstmt.setInt(2, idst); pstmt.setInt(3, idclass);
							pstmt.setInt(4, attend); pstmt.setInt(5, mid);  pstmt.setInt(6, finalp);
							pstmt.setInt(7, elsep); pstmt.setInt(8, total);  pstmt.setString(9, grade);
							pstmt.executeUpdate();
							String query8 = "SELECT * FROM attend";
							txtResult.append("[Attend ���̺�]\n");
							txtResult.append("idProfessor	idStudent	idClass	attendPoint	midPoint	finalPoint	elsePoint	total	grade	year	semester\n");
							rs = stmt.executeQuery(query8);  
							while (rs.next()) {
								String str8 =  rs.getInt(1) +"\t"+  rs.getInt(2) + "\t"+ rs.getInt(3)+  "\t"+ rs.getInt(4)+ "\t"+ rs.getInt(5)+"\t"+  rs.getInt(6) +"\t"+
										rs.getInt(7) + "\t"+ rs.getInt(8) +"\t"+ rs.getString(9)+ "\t"+rs.getInt(10)+ "\t" + rs.getInt(11)+"\n";
								txtResult.append(str8);
							}
						}						
						else
							System.out.println("�����ϴ� Ŭ������ �ƴմϴ�");
					}
					else if(e.getSource()==btn6)//�л��� ����ǥ ���
					{
						stmt = con.createStatement();
						int id = Integer.parseInt(JOptionPane.showInputDialog("������ ��ȸ�� �����л�id�� �Է��Ͻÿ�."));
						String query;
						int sum=0;
						int cnt=0;
						txtResult.append("\n"+id+"�л��� ����ǥ\n");

						for(int i=2020; i>=2019; )
						{
							for(int j=2; j>0; j--)
							{
								sum=0;cnt=0;
								txtResult.append(id+"�л��� "+i+"�� "+j+"�б� [����]\n");
								query = "select  class.idClass, class.name, class.credit, attend.attendPoint, attend.midPoint, attend.finalPoint, attend.elsePoint,"
										+ " attend.total, attend.grade from class, attend where class.idClass=attend.idClass and "
										+ "attend.idStudent = '"+id+"' and attend.year = "+i+" and attend.semester = "+j;
								rs = stmt.executeQuery(query); 
								txtResult.append("�����ȣ\t�����\t�������\t�⼮����\t�߰�����\t�⸻����\t��Ÿ����\t����\t����\n");
								while (rs.next()) {
									String str = rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4)+"\t"+ rs.getInt(5)+"\t"+ rs.getInt(6)+"\t"+ rs.getInt(7)+"\t"+rs.getInt(8)+"\t"+rs.getString(9) + "\n";
									txtResult.append(str);
									sum += rs.getInt(8);
									cnt++;
								}
								txtResult.append(i+"��"+j+"�б� GPA: "+ (sum/cnt)+"\n\n");
							}
							i--;
						}
					}
				} 
				catch (Exception e2) {
					System.out.println("������ ��ȸ ���� :" + e2);
				}
			}
		}
	}

	class JPanel03 extends JPanel{
		JButton btnTable, btnTime, btnClub, btnPaper;
		JTextArea txtResult;
		JPanel pn1;
		MyStudentbtnTable dialog;
		MyClubTable dialog3 = new MyClubTable(jp3, getTitle());

		public JPanel03() {
			btnTable = new JButton("�������� ��ȸ");
			btnTime = new JButton("�ð�ǥ ��ȸ");
			btnClub = new JButton("���Ƹ� ��ȸ");
			btnPaper = new JButton("����ǥ ��ȸ");
			dialog = new MyStudentbtnTable(this, "test");

			pn1 = new JPanel();
			pn1.add(btnTable);
			pn1.add(btnTime);
			pn1.add(btnClub);
			pn1.add(btnPaper);

			txtResult = new JTextArea(20,90);
			txtResult.setEditable(true);
			JScrollPane scrollPane = new JScrollPane(txtResult);
			add("North", pn1);
			add("Center", scrollPane);   

			btnTable.addActionListener(new MybtnTable());
			btnTime.addActionListener(new MybtnTime());
			btnClub.addActionListener(new MybtnClub());
			btnPaper.addActionListener(new MybtnPaper());

		}
		//�������� ��ȸ
		class MybtnTable implements ActionListener{
			public void actionPerformed(ActionEvent e)
			{
				try {
					stmt = con.createStatement();
					dialog.setVisible(true);

					String id = dialog.getInputI();
					String year = dialog.getInputY();
					String semester = dialog.getInputS();

					String query1;

					query1 = "select * from class where idClass in (select idClass from attend where idStudent = "+ id +" and year = "+ year + " and semester = "+semester+")";

					//query1 = "SELECT * FROM student";

					txtResult.setText("");
					txtResult.append(id+"�л���  [CLASS ���̺�]\n");
					txtResult.append("���¹�ȣ"+ "\t"+"�йݹ�ȣ"+"\t"+"�����̸�"+"\t"+"���ǿ���"+"\t"+"���Ǳ���"+"\t"+"����"+"\t"+"���½ð�"+"\t"+"���ǽ�"+"\t"+"���� ����"+"\t"+"���� �а�"+"\n");
					rs = stmt.executeQuery(query1); 
					while (rs.next()) {
						String str1 = rs.getInt(1) +"\t"+  rs.getString(2) + "\t"+ rs.getString(3)+  "\t"+ rs.getString(4)+ "\t"+ rs.getString(5)+"\t"+  rs.getString(6) +"\t"+
								rs.getInt(7) + "\t "+ rs.getInt(8) +"\t"+ rs.getInt(9)+ "\t"+rs.getInt(10)+ "\n";
						txtResult.append(str1);

					}}
				catch (Exception e2) {
					txtResult.setText("");
					System.out.println("������ �Է� ���� :" + e2);
				}
			}
		}

		//�ð�ǥ ���
		class MybtnTime implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				try {
					stmt = con.createStatement();
					dialog.setVisible(true);
					char [] week = {'��', 'ȭ', '��', '��', '��'};
					String id = dialog.getInputI();
					String year = dialog.getInputY();
					String semester = dialog.getInputS();

					String query2;
					String classname=null;
					int startTime=11;
					int endTime=11;
					char classWeek = 0;
					//query2 = "select * from class where idClass in (select idClass from attend where idStudent = "+ id +" and year = "+ year + " and semester = "+semester+")";

					txtResult.setText("");
					txtResult.append(id+"�л��� "+year+"�� "+semester+"�б� [�ð�ǥ ���̺�]\n");
					txtResult.append("����"+ "\t"+"��"+"\t"+"ȭ"+"\t"+"��"+"\t"+"��"+"\t"+"��"+"\n");

					for(int i=1; i<=10; i++)
					{
						txtResult.append(i+"����\t");
						for(int j=1; j<6; j++)
						{
							query2 = "select name, timeOfStart, time, week from class where idClass in (select idClass from attend where idStudent = "+id+ " and year = " +year+ " and semester = " + semester +" and week = '"+week[j-1]+"')";
							rs = stmt.executeQuery(query2); 

							if(rs.next())
							{
								classname = rs.getString(1);
								startTime = rs.getInt(2);
								endTime = rs.getInt(3);
								String DWeek = rs.getString(4);
								classWeek = DWeek.charAt(0);
							}
							if(i>=startTime&&i<=(startTime+endTime)&&(classWeek==week[j-1]))
							{
								txtResult.append(classname);
							}
							txtResult.append("\t");
						}
						txtResult.append("\n");;
					}
				}
				catch (Exception e2) {
					System.out.println("������ �Է� ���� :" + e2);
				}
			}
		}
		class MybtnClub implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int flag = 0;
				int pstid =0;
				int clubid =0;
				try {
					stmt = con.createStatement();
					dialog3.setVisible(true);  
					String stid = dialog3.getInputI();
					String query1;	
					query1 = "select club.idclub , club.name, numstudent, club.room, cProfessor, pStudent from studentclub, club where club.idclub = studentclub.idclub and studentclub.idStudent= "+stid;
					txtResult.setText("");
					txtResult.append(stid+"�л���  [���Ƹ� ���̺�]\n");
					txtResult.append("���Ƹ���ȣ"+ "\t"+"���Ƹ��̸�"+"\t"+"�л�����"+"\t"+"�ּ�"+"\t"+"��������"+"\t"+"ȸ��"+"\n");
					rs = stmt.executeQuery(query1); 
					while (rs.next()) {
						String str1 = rs.getInt(1) +"\t"+  rs.getString(2) + "\t"+ rs.getInt(3)+  "\t"+ rs.getInt(4)+ "\t"+ rs.getInt(5)+"\t"+ rs.getInt(6) +"\n";
						txtResult.append(str1);	
						pstid = Integer.parseInt(stid);
						clubid = rs.getInt(1);
						if(pstid == rs.getInt(6))
							flag =1;
					}
					if(flag ==1)
					{
						txtResult.append(clubid +"�л�ȸ����  [�л� ���̺�]\n");
						txtResult.append("�л���ȣ"+ "\t"+"�̸�"+"\t"+"�ּ�"+"\t"+"����ȣ"+"\t"+"�̸���"+"\t"+"����"+"\t"+"��������"+"\t"+"�а�"+"\t"+"�г�"+"\t"+"�б�"+"\n");
						String query2 = "select student.idstudent , student.name, student.address, student.phoneNumber, student.email, account, mProfessor, mDepartment, schoolYear, studentSemester \r\n"
								+ "from student, studentclub \r\n"
								+ "where student.idstudent = studentclub.idstudent and idclub = " +clubid;
						rs = stmt.executeQuery(query2); 
						while (rs.next()) {
							String str1 = rs.getInt(1) +"\t"+  rs.getString(2) + "\t"+ rs.getString(3)+  "\t"+ rs.getString(4)+ "\t"+ rs.getString(5)+""+  rs.getString(6) +"\t"+
									rs.getInt(7) + "\t "+ rs.getInt(8) +"\t"+ rs.getInt(9)+ "\t"+rs.getInt(10)+ "\n";
							txtResult.append(str1);

						}
					}
				}
				catch (Exception e2) {
					System.out.println("������ �Է� ���� :" + e2);
				}
			}
		}
		class MybtnPaper implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				try {
					stmt = con.createStatement();
					int id = Integer.parseInt(JOptionPane.showInputDialog("����ǥ�� ��ȸ�� �л�id�� �Է��Ͻÿ�."));
					String query;
					int sum=0;
					int cnt=0;
					txtResult.setText("");
					txtResult.append(id+"�л��� ����ǥ\n");

					for(int i=2020; i>=2019; )
					{
						for(int j=2; j>0; j--)
						{
							sum=0;cnt=0;
							txtResult.append(id+"�л��� "+i+"�� "+j+"�б� [����]\n");
							query = "select  class.idClass, class.name, class.credit, attend.total, attend.grade from class, attend where class.idClass=attend.idClass and "
									+ "attend.idStudent = '"+id+"' and attend.year = "+i+" and attend.semester = "+j;
							rs = stmt.executeQuery(query); 
							txtResult.append("�����ȣ\t�����\t�������\t����\t����\n");
							while (rs.next()) {
								String str = rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4)+"\t"+rs.getString(5) + "\n";
								txtResult.append(str);
								sum += rs.getInt(4);
								cnt++;
							}
							txtResult.append(i+"��"+j+"�б� GPA: "+ (sum/cnt)+"\n\n");
						}
						i--;
					}

				}
				catch (Exception e2) {
					System.out.println("������ �Է� ���� :" + e2);
				}
			}
		}	   
	}

	public void conDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("����̹� �ε� ����");
			//txtStatus.append("����̹� �ε� ����...\n");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try { /* �����ͺ��̽��� �����ϴ� ���� */
			//System.out.println("�����ͺ��̽� ���� �غ�...");
			//txtStatus.append("�����ͺ��̽� ���� �غ�...\n");
			con = DriverManager.getConnection(url, userid, pwd);
			//System.out.println("�����ͺ��̽� ���� ����");
			//txtStatus.append("�����ͺ��̽� ���� ����...\n");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DBProject2101 BLS = new DBProject2101();


		//BLS.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//BLS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BLS.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				try {
					con.close();
				} catch (Exception e4) { 	}
				System.out.println("���α׷� ���� ����!");
				System.exit(0);
			}
		});
	}
}
