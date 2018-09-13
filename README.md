# Student Course Registration
Student Course Registration demo project

## Requirements

Use whatever technology you prefer, not necessarily Hibernate or iBatis or EJB.

Student: ID, Name

Course: ID, Name

A student can take many courses and a course can have many students.

1. Write skeleton code of entity bean (or whatever technologies you like) classes to model Student and Course and student course registration.

1. Write a skeleton Student DAO class that support

    1. Add a new student along with their course registrations.

    1. Delete a student.

    1. Get all students, sorted by their name, for a given course with course name as input.

    1. (Bonus) What if we want to record course scores?  What possible changes need to be made? Explain briefly.

    1. (Bonus) How to find all students who don’t register for a given course?  

Notes:

1. Code skeleton is enough. No need to write every single line.  

1. Need both entity bean classes (again use whatever technologies/framework you like) as well as table DDLs.

1. For the DAO class need query details for relevant questions.

1. Show proper transaction management.

1. Show best practice(s) when you can solve the problems with multiple approaches.  If possible comment why one approach is better than the others.

1. We love Hibernate and also hate it!!

## Notes about setup

1. Started at https://start.spring.io/, selected Boot v1.5.16 (Eclipse Photon didn't like v2.x), Web and JPA components.
1. Used examples from here: https://github.com/KidPluto/marcobehler-java-db-and-tx
1. In the pom.xml added the follow, to have an in-memory database to play with.

```xml
       <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>1.4.187</version>
        </dependency>
```

## Result

1. I ended up taking too much time, and wrote lots of code in the attempt to get something which I could run.

