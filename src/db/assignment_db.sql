-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2024 at 08:45 PM
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
  `b_fname` varchar(50) NOT NULL,
  `b_lname` varchar(50) NOT NULL,
  `b_email` varchar(50) NOT NULL,
  `b_contact` varchar(50) NOT NULL,
  `b_price` varchar(30) NOT NULL,
  `b_paytype` varchar(50) NOT NULL,
  `b_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_booking`
--

INSERT INTO `tbl_booking` (`b_id`, `b_fname`, `b_lname`, `b_email`, `b_contact`, `b_price`, `b_paytype`, `b_status`) VALUES
(1, 'asd', 'asd', 'asd', 'asd', '1', 'Card', 'Confirmed'),
(2, 'jade', 'jade', 'j', 'j', '412313', 'Card', 'Available'),
(3, 'cedric', 'getuaban', 'test@test.com', '0945-258-6033', '10,000', 'Cash', 'Pending');

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
(1, '11', '12313', '45', 'queen', 'Triple Room', 'Available'),
(2, '4th', '3000', '4 persons', 'queen size', 'Double Room', 'Available'),
(3, '5th', '213123', '2 persons', 'Double', 'Single Room', 'Available'),
(4, '100th', '21312321', '5 persons', 'King', 'Triple Room', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaction`
--

CREATE TABLE `tbl_transaction` (
  `t_payer` varchar(50) NOT NULL,
  `t_paymentmethod` varchar(50) NOT NULL,
  `t_operator` varchar(50) NOT NULL,
  `t_amount` varchar(50) NOT NULL,
  `t_id` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
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
(101, 'gwapo', 'ko', 'cedric@gmail.com', 'wawa', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', ''),
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
(122, 'jade', 'jade', 'jade@jade.jade', 'jade', 'IaBSkZHE3vZJ+XsF20Bozr/eFJ2WTKLHeEhbEYe0P6Q=', 'Admin', 'Active', ''),
(124, 'mariele', 'gwapa', 'gwapa@gwapa.gwapa', 'mayel', 'fKuw2Zy/8C1xWkDo9mEuo2qYkj0WbOCE6LHdunvylf8=', 'Admin', 'Active', 'src/userimages/442002456_816900673622128_6319524800125962731_n.jpg'),
(125, 'haha', 'haha', 'asdasdasdada', 'hehe', '8vVNN4z86CG4zowR1KmYkQuMX7A3lIz5pXERwNXHqkQ=', 'Admin', 'Active', ''),
(126, 'mayel', 'mayel', 'mayel@mayel.mayel', 'mayelmayel', 'fKuw2Zy/8C1xWkDo9mEuo2qYkj0WbOCE6LHdunvylf8=', 'User', 'Active', 'src/userimages/440327957_427312810232033_3043994306566299425_n.jpg'),
(127, 'asd', 'asd', 'aaa', 'cedd', '1z79FYTF6JKY46Wp7g5QZ2vmpBqw1eXl3QUbQaJSfRM=', 'Admin', 'Pending', 'src/userimages/440327957_427312810232033_3043994306566299425_n.jpg'),
(128, 'asdasda', 'asddasd', 'adasdasd', 'asdadasdas', 'hbDEi87zK3/OoGR79yc/BcqYUzI7HV+iXSbzNQViFN4=', 'Admin', 'Active', 'src/userimages/icons8-5-star-hotel-64.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_booking`
--
ALTER TABLE `tbl_booking`
  ADD PRIMARY KEY (`b_id`);

--
-- Indexes for table `tbl_room`
--
ALTER TABLE `tbl_room`
  ADD PRIMARY KEY (`r_id`);

--
-- Indexes for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD PRIMARY KEY (`t_id`);

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
  MODIFY `b_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_room`
--
ALTER TABLE `tbl_room`
  MODIFY `r_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `t_id` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=129;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
