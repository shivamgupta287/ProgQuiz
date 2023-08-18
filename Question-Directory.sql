CREATE DATABASE  IF NOT EXISTS `question_directory`;
USE `question_directory`;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category` varchar(45) DEFAULT NULL,
  `difficulty_level` varchar(45) DEFAULT NULL,
  `option1` varchar(45) DEFAULT NULL,
  `option2` varchar(45) DEFAULT NULL,
  `option3` varchar(45) DEFAULT NULL,
  `option4` varchar(45) DEFAULT NULL,
  `question_title` varchar(255) DEFAULT NULL,
  `right_answer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `question`
--

INSERT INTO `question` VALUES 
	(1,'JAVA','Easy','class','interface','extends','implements','Which java keyword is used to create a subclass?','extends'),
    (2, 'JAVA', 'Easy', 'int', 'float', 'String', 'boolean', 'Which data type is used to store whole numbers?', 'int'),
    (3, 'JAVA', 'Medium', 'false', 'true', 'null', 'void', 'In Java, what keyword is used to define a method that does not return any value?', 'void'),
    (4, 'JAVA', 'Hard', 'NullPointerException', 'ClassCastException', 'ArrayIndexOutOfBoundsException', 'NumberFormatException', 'Which exception is thrown when trying to access an index that is outside the bounds of an array?', 'ArrayIndexOutOfBoundsException'),
    (5, 'JAVA', 'Easy', 'public static void main(String[] args)', 'public static void start(String[] args)', 'public static int main(String[] args)', 'public static void run(String[] args)', 'What is the correct signature for the main method in Java?', 'public static void main(String[] args)'),
    (6, 'JAVA', 'Medium', 'private', 'protected', 'public', 'static', 'Which access modifier specifies that a method or variable can be accessed from any other class?', 'public'),
    (7, 'JAVA', 'Hard', 'overloading', 'overriding', 'encapsulation', 'polymorphism', 'What is the term for defining multiple methods in a class with the same name but different parameter lists?', 'overloading'),
    (8, 'Python', 'Easy', 'list', 'tuple', 'dictionary', 'set', 'Which data structure in Python is an ordered collection?', 'list'),
    (9, 'Python', 'Medium', 'len()', 'size()', 'count()', 'length()', 'Which function is used to find the number of elements in a list or other iterable?', 'len'),
    (10, 'Python', 'Hard', 'polymorphism', 'encapsulation', 'inheritance', 'abstraction', 'Which principle of object-oriented programming refers to the ability to create a new class that inherits properties from an existing class?', 'inheritance'),
    (11, 'Python', 'Medium', 'TypeError', 'NameError', 'ValueError', 'SyntaxError', 'Which error is raised when trying to concatenate a string and an integer without converting the integer to a string?', 'TypeError'),
    (12, 'Python', 'Hard', 'dictionary', 'set', 'list', 'tuple', 'Which built-in data structure in Python uses curly braces and contains key-value pairs?', 'dictionary'),
    (13, 'Python', 'Medium', 'break', 'exit', 'return', 'continue', 'Which keyword is used to terminate the current loop iteration and proceed to the next iteration?', 'continue');

    -- Add more questions here...

