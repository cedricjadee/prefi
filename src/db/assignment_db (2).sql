-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2024 at 03:01 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `assignment_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_booking`
--

CREATE TABLE `tbl_booking` (
  `b_id` int(30) NOT NULL,
  `u_id` int(11) NOT NULL,
  `r_id` int(11) NOT NULL,
  `b_name` varchar(50) NOT NULL,
  `b_roomtype` varchar(50) NOT NULL,
  `b_in` varchar(50) NOT NULL,
  `b_out` varchar(50) NOT NULL,
  `b_paytype` varchar(50) NOT NULL,
  `b_statusdate` varchar(50) NOT NULL,
  `b_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_booking`
--

INSERT INTO `tbl_booking` (`b_id`, `u_id`, `r_id`, `b_name`, `b_roomtype`, `b_in`, `b_out`, `b_paytype`, `b_statusdate`, `b_status`) VALUES
(1, 118, 2, 'ced', 'ss', 's', 's', 's', 's', 'Canceled'),
(10, 126, 4, 'sss', 'Single Room', 'ss', 'sss', 'Card', '2024-05-19', 'Pending'),
(20, 126, 2, 'ss', 'Single Room', 'ss', 'ss', 'Card', '2024-05-19', 'Pending'),
(21, 126, 1, 'cedricjadee', 'Triple Room', 'Sun May 19 20:28:03 SGT 2024', 'Sat May 25 20:28:12 SGT 2024', 'Cash', '2024-05-19', 'Pending'),
(22, 126, 6, 'gwapo', 'Triple Room', 'Thu May 09 22:13:45 SGT 2024', 'Thu May 16 22:13:48 SGT 2024', 'Cash', '2024-05-19', 'Pending'),
(23, 126, 6, 'mariela agata', 'Single Room', 'Sun May 19 22:45:40 SGT 2024', 'Sun May 26 22:45:43 SGT 2024', 'Card', '2024-05-19', 'Pending'),
(24, 126, 6, 'mariela agata', 'Single Room', 'Sun May 19 22:46:32 SGT 2024', 'Sun May 26 22:46:34 SGT 2024', 'Card', '2024-05-19', 'Pending'),
(25, 126, 6, 'mariela agata', 'Single Room', 'Sun May 19 22:50:18 SGT 2024', 'Sun May 26 22:50:20 SGT 2024', 'Card', '2024-05-19', 'Pending'),
(26, 126, 1, 'asdsad', 'Single Room', 'Thu May 09 22:51:36 SGT 2024', 'Wed May 15 22:51:37 SGT 2024', 'Card', '2024-05-19', 'Pending'),
(27, 126, 6, 'ellie', 'Single Room', 'Mon May 20 19:43:51 SGT 2024', 'Tue May 21 19:43:54 SGT 2024', 'Card', '2024-05-20', 'Pending'),
(28, 126, 1, 'ellie', 'Single Room', 'Mon Jul 01 20:00:34 SGT 2024', 'Wed Jul 31 20:00:38 SGT 2024', 'Card', '2024-05-20', 'Pending'),
(29, 126, 1, 'ellie', 'Single Room', 'Mon Jul 01 20:06:45 SGT 2024', 'Wed Jul 31 20:06:49 SGT 2024', 'Card', '2024-05-20', 'Pending'),
(30, 126, 2, 'asd', 'Single Room', 'Fri May 17 20:20:29 SGT 2024', 'Thu May 23 20:20:30 SGT 2024', 'Card', '2024-05-20', 'Pending'),
(31, 126, 3, 'asd', 'Single Room', 'Fri May 17 20:25:49 SGT 2024', 'Thu May 30 20:25:51 SGT 2024', 'Card', '2024-05-20', 'Pending'),
(32, 126, 4, 'jadey', 'Single Room', 'Thu May 23 00:00:00 SGT 2024', 'Thu May 16 20:27:21 SGT 2024', 'Card', '2024-05-20', 'Pending'),
(33, 126, 5, 'elle', 'Single Room', 'Fri May 31 20:27:41 SGT 2024', 'Tue Dec 31 20:27:43 SGT 2024', 'Card', '2024-05-20', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_room`
--

CREATE TABLE `tbl_room` (
  `r_id` int(30) NOT NULL,
  `r_floor` varchar(50) NOT NULL,
  `r_price` varchar(50) NOT NULL,
  `r_capacity` varchar(50) NOT NULL,
  `r_bedsize` varchar(50) NOT NULL,
  `r_type` varchar(50) NOT NULL,
  `r_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_room`
--

INSERT INTO `tbl_room` (`r_id`, `r_floor`, `r_price`, `r_capacity`, `r_bedsize`, `r_type`, `r_status`) VALUES
(1, '11', '12313', '45', 'queen', 'Triple Room', 'Not Available'),
(2, '4th', '3000', '4 persons', 'queen size', 'Double Room', 'Not Available'),
(3, '5th', '213123', '2 persons', 'Double', 'Single Room', 'Not Available'),
(4, '100th', '21312321', '5 persons', 'King', 'Triple Room', 'Not Available'),
(5, '2', '200', '2 persons', 'Double', 'Single Room', 'Not Available'),
(6, '100th', '2000000', '5 persons', 'Double', 'Single Room', 'Not Available');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(30) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(150) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_type`, `u_status`, `u_image`) VALUES
(102, 'c', 'c', 'c', 'c', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', ''),
(103, 'c', 'c', 'c', 'c', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', ''),
(108, 'c', 'c', 'ccc', 'ccc', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', ''),
(109, 'jade', 'getuaban', 'getuaban@test.test', 'test', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Pending', ''),
(111, 's', 's', 's', 's', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', ''),
(112, 'cc', 'cc', 'vv', 'v', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', ''),
(113, 'cedric', 'getuaban', 'cedricjade13@gmail.com', 'cedricjadee', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', ''),
(114, 'test', 'test', 'test', 'tests', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', ''),
(115, 'test', 'test', 'tessttinggg', 'testgwapo', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Pending', ''),
(116, 'test', 'test', 'testttt', 'testttttt', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', ''),
(117, 'Cedric Jade', 'Getuaban', 'cedricjade@gmail.com', 'cedricjade', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Pending', ''),
(118, 'asd', 'asd', 'asd', 'asd', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', ''),
(120, 'leslie', 'getuaban', 'leslie@gmail.com', 'lesbert', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Admin', 'Active', ''),
(122, 'jade', 'jade', 'jade@jade.jade', 'jade', 'IaBSkZHE3vZJ+XsF20Bozr/eFJ2WTKLHeEhbEYe0P6Q=', 'Admin', 'Active', 'src/userimages/register.jpg'),
(124, 'mariele', 'gwapa', 'gwapa@gwapa.gwapa', 'mayel', 'fKuw2Zy/8C1xWkDo9mEuo2qYkj0WbOCE6LHdunvylf8=', 'Admin', 'Active', 'src/userimages/442002456_816900673622128_6319524800125962731_n.jpg'),
(125, 'haha', 'haha', 'asdasdasdada', 'hehe', '8vVNN4z86CG4zowR1KmYkQuMX7A3lIz5pXERwNXHqkQ=', 'Admin', 'Active', ''),
(126, 'mayel', 'mayel', 'asdadasd', 'ellie', 'FxjCSxCuuAmeP8RJYKtpSat2omc1JFnyA+oQNr7DgsI=', 'User', 'Active', 'src/userimages/ggg.jpg'),
(127, 'asd', 'asd', 'aaa', 'cedd', '1z79FYTF6JKY46Wp7g5QZ2vmpBqw1eXl3QUbQaJSfRM=', 'Admin', 'Pending', 'src/userimages/440327957_427312810232033_3043994306566299425_n.jpg'),
(128, 'asdasda', 'asddasd', 'adasdasd', 'asdadasdas', 'hbDEi87zK3/OoGR79yc/BcqYUzI7HV+iXSbzNQViFN4=', 'Admin', 'Active', 'src/userimages/icons8-5-star-hotel-64.png'),
(129, 'cedric', 'cedric', 'cedric', 'cedric', 'eTZtaWscYZfNWAQaJElBWfPlyvqIsR1QT2fMMiAGh0o=', 'Admin', 'Active', 'src/userimages/admin.png'),
(130, 'aasdadasdas', 'dasdasdas', 'dadsad', 'asdasd', '0WhpAc1PhIaR6xD3Vv9vUxW/5TIKa5bDliKjuONVDTs=', 'Admin', 'Active', 'src/userimages/userbg.jpg'),
(131, 'asdaa', 'dasdasd', 'asdasd', 'asdad', 'ucX9rqdO4cMXBbdkOJiVNxuNQWxcrodA5/iQgqn83Ao=', 'Admin', 'Active', 'src/userimages/loginbgd.jpg'),
(132, 'ced', 'cedd', 'cedd@cedd', 'ceddcedd', '1z79FYTF6JKY46Wp7g5QZ2vmpBqw1eXl3QUbQaJSfRM=', 'User', 'Active', 'src/userimages/loading.jpg'),
(133, 'carl', 'carl', 'carl', 'carl', 'zIgchiM4OesuVAg3bCnJInUF2CRRKzqRTgzrp1684DQ=', 'Admin', 'Active', 'src/userimages/icons8-loading-50.png'),
(134, 'm', 'm', 'm', 'm', 'TGeqCG0rLJ3ry46iVx0A+dTwCHNQiCjp+AiQedgK+LI=', 'Admin', 'Active', 'src/userimages/g2.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_booking`
--
ALTER TABLE `tbl_booking`
  ADD PRIMARY KEY (`b_id`),
  ADD KEY `uid` (`u_id`),
  ADD KEY `rid` (`r_id`);

--
-- Indexes for table `tbl_room`
--
ALTER TABLE `tbl_room`
  ADD PRIMARY KEY (`r_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_booking`
--
ALTER TABLE `tbl_booking`
  MODIFY `b_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `tbl_room`
--
ALTER TABLE `tbl_room`
  MODIFY `r_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=135;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_booking`
--
ALTER TABLE `tbl_booking`
  ADD CONSTRAINT `rid` FOREIGN KEY (`r_id`) REFERENCES `tbl_room` (`r_id`),
  ADD CONSTRAINT `uid` FOREIGN KEY (`u_id`) REFERENCES `tbl_user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
