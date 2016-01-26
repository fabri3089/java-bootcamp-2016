SELECT co.`name`, te.`lastName`, te.`firstName`, st.`lastName`, st.`firstName`
FROM student st INNER JOIN course_student cs ON st.`registrationNumber`=
cs.`studentRegistrationNumber` INNER JOIN course co ON cs.`nameCourse`=
co.`name` INNER JOIN teacher te ON co.`asignedTeacher`=te.`lastName`
ORDER BY co.`name`, st.`lastName`

SELECT te.`lastName`, te.`firstName`, cosc.`courseName`, cosc.`scheduleTime`
FROM teacher te INNER JOIN course co ON te.`lastName`=co.`asignedTeacher`
INNER JOIN course_scheduletime cosc ON co.`name`=cosc.`courseName`
ORDER BY cosc.`courseName`,te.`lastName`
