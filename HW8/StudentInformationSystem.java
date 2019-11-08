import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

enum Gender {
    MALE, FEMALE
}

@SuppressWarnings("serial")
public class StudentInformationSystem extends JFrame {
    private ArrayList<Student> students;
    private JTable table;
    private JTextField newStudentInformation;
    private JButton add;
    private JScrollPane jsp;
    private Font font;
    StudentsTableModel sModel;

    public static void main(String args[]) {
        StudentInformationSystem system = new StudentInformationSystem();
        Student s1 = new Student("Susan", 1, Gender.FEMALE);
        Student s2 = new Student("Sean", 2, Gender.MALE);
        system.addStudent(s1);
        system.addStudent(s2);
    }

   
	public StudentInformationSystem() {
        students = new ArrayList<>();

        createComponents();
        addComponents();
        setLayout();
        addBehaviors();
        display();
    }

    private void createComponents() {
        font = new Font("TimesRoman", Font.PLAIN, 20);

        add = new JButton("Add");
        add.setFont(font);

        newStudentInformation = new JTextField();
        newStudentInformation.setFont(font);

        sModel = new StudentsTableModel(students);
        table = new JTable(sModel);
        table.setFont(font);
        table.setRowHeight(20);


        jsp = new JScrollPane(table);
        jsp.setFont(font);
    }

    private void setLayout() {
        GridLayout gl = new GridLayout(3, 1);
        Container c = getContentPane();
        c.setLayout(gl);
    }

    private void addComponents() {
        Container c = getContentPane();

        c.add(jsp);
        c.add(newStudentInformation);
        c.add(add);
    }

    private void addBehaviors() {
        AddListener al = new AddListener();
        add.addActionListener(al);
    }

    private void display() {
        setSize(600, 600);
        setVisible(true);
    }


    private void addStudent(Student s) {
        students.add(s);
    }

    class AddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] newStudent = newStudentInformation.getText().split(" ");
            for (int i = 0; i < 3; i++) {
                System.out.println(newStudent[i] + "+");
            }
            if (e.getSource() == add) {
                if (newStudent[2].equals("MALE")) {
                    students.add(new Student(newStudent[0], Integer.parseInt(newStudent[1]), Gender.MALE));
                }
                if (newStudent[2].equals("FEMALE")) {
                    students.add(new Student(newStudent[0], Integer.parseInt(newStudent[1]), Gender.FEMALE));
                }
            }
            //after add, refresh the panel
            jsp.repaint();
            getContentPane().add(jsp);
            getContentPane().repaint();
        }
    }

}

class Student {
    int id;
    String name;
    Gender gender;

    public Student(String name, int id, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}

class StudentsTableModel implements TableModel {
    private ArrayList<Student> students;

    public StudentsTableModel(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0)
            return "Name";
        if (columnIndex == 1)
            return "ID";
        if (columnIndex == 2)
            return "Gender";
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int row = -1;
        for (Student student : students) {
            row++;
            if (row == rowIndex) {
                if (columnIndex == 0) {
                    return student.getName() + "";
                }
                if (columnIndex == 1) {
                    return student.getId() + "";
                }
                if (columnIndex == 2) {
                    return student.getGender() + "";
                }
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
