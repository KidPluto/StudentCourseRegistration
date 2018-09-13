/*
 * This is the class which is auto-generated, as part of using start.spring.io
 */
package net.kidpluto.StudentCourseRegistration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentCourseRegistrationApplicationTests {

	@Test
	public void contextLoads() {
	}

	/*
	 * Everything past this point was added after the class was auto-generated.
	 */

//	Students: 
//		10 Mike
//		11 Carol
//		12 Greg
//		13 Marcia
//		14 Peter 
//		15 Jan
//		16 Bobby
//		17 Cindy
//		18 Alice
//
//  Classes: 
//		100 Relativistic Quantum Field Theory
//		101 Many-body Theory for Condensed Matter Systems
//		102 String Theory and Holographic Duality
//		103 Particle Physics of the Early Universe

	@Test
	public void testStudent() {
		// Create student(s)
		Student mike = new Student(10L, "Mike");

		// Create course(s)
		Course relativistic = new Course(100L, "Relativistic Quantum Field Theory");
		Course manyBody = new Course(101L, "Many-body Theory for Condensed Matter Systems");

		mike.setCourseRegistered(relativistic);
		mike.setCourseRegistered(manyBody);

		List<Course> courses = new ArrayList<Course>(mike.getCoursesRegistered());
		assertNotNull(courses);
		assertTrue(courses.size() == 2);
		System.out.println("Mike is registered for: " + courses.get(0) + ", " + courses.get(1));
	}

	@Test
	public void testCourse() {
		// Create student(s)
		Student mike = new Student(10L, "Mike");
		Student alice = new Student(18L, "Alice");

		// Create course(s)
		Course class103 = new Course(103L, "Particle Physics of the Early Universe");

		mike.setCourseRegistered(class103);
		alice.setCourseRegistered(class103);

		// DEBUG - this isn't breaking, but not seeing the print statement in the
		// console
		List<Student> students = new ArrayList<Student>(class103.getStudentsRegistered());
		assertNotNull(students);
		assertTrue(students.size() == 2);
		System.out.println("Class 103 has the following students: " + students.get(0) + ", " + students.get(1));
	}

	@Test
	public void getDatabaseConnection() {
		DataSource ds = getDataSource();
		try (Connection connection = ds.getConnection()) {
			System.out.println("Successful got DB connection, using datasource.");
		} catch (SQLException e) {
			fail(e.getMessage());
		}
	}

	private DataSource getDataSource() {
		JdbcDataSource ds = new JdbcDataSource();
		ds.setURL("jdbc:h2:mem:exercise_db;DB_CLOSE_DELAY=-1");
		ds.setUser("sa");
		ds.setPassword("sa");
		return ds;
	}
}
