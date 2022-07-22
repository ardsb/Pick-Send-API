-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 22, 2022 at 07:04 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Pick_Send_System`
--

-- --------------------------------------------------------

--
-- Table structure for table `operation_center`
--

CREATE TABLE `operation_center` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city_name` varchar(255) DEFAULT NULL,
  `tel_number` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `operation_center`
--

INSERT INTO `operation_center` (`id`, `address`, `city_name`, `tel_number`) VALUES
(1, '65 Princess Gate', 'Colombo 12', '0119288462'),
(2, '167 Sri Saranankara Rd', 'Dehiwala', '0117384927');

-- --------------------------------------------------------

--
-- Table structure for table `package`
--

CREATE TABLE `package` (
  `id` bigint(20) NOT NULL,
  `date_created` varchar(255) DEFAULT NULL,
  `package_status` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `receiver_address` varchar(255) DEFAULT NULL,
  `receiver_contact` varchar(255) DEFAULT NULL,
  `receiver_name` varchar(255) DEFAULT NULL,
  `sender_address` varchar(255) DEFAULT NULL,
  `sender_availability` varchar(255) DEFAULT NULL,
  `sender_contact` varchar(255) DEFAULT NULL,
  `sender_name` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `package`
--

INSERT INTO `package` (`id`, `date_created`, `package_status`, `price`, `receiver_address`, `receiver_contact`, `receiver_name`, `sender_address`, `sender_availability`, `sender_contact`, `sender_name`, `size`, `type`, `weight`) VALUES
(1, '2/04/2021', 'Pending to send', '1200', 'Princess street', '07667733', 'Ismail', 'Princess Gate', '', '07667733', 'Mohammed', '4*4', 'Food', '12'),
(2, '', 'Pending to ', '', 'Princess street', '07667733', 'Ismail', 'Princess Gate', '', '07667733', 'Mohammed', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `package_charges`
--

CREATE TABLE `package_charges` (
  `id` bigint(20) NOT NULL,
  `package_size_2*2` int(11) DEFAULT NULL,
  `package_size_4*4` int(11) DEFAULT NULL,
  `package_size_6*6` int(11) DEFAULT NULL,
  `package_size_8*8` int(11) DEFAULT NULL,
  `package_weight_1kg` int(11) DEFAULT NULL,
  `package_weight_2kg` int(11) DEFAULT NULL,
  `package_weight_3kg` int(11) DEFAULT NULL,
  `package_weight_4kg` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `package_charges`
--

INSERT INTO `package_charges` (`id`, `package_size_2*2`, `package_size_4*4`, `package_size_6*6`, `package_size_8*8`, `package_weight_1kg`, `package_weight_2kg`, `package_weight_3kg`, `package_weight_4kg`) VALUES
(1, 550, 950, 1350, 1650, 850, 1150, 1450, 1850);

-- --------------------------------------------------------

--
-- Table structure for table `package_tracks`
--

CREATE TABLE `package_tracks` (
  `id` bigint(20) NOT NULL,
  `date_created` varchar(255) DEFAULT NULL,
  `package_id` varchar(255) DEFAULT NULL,
  `package_status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `package_tracks`
--

INSERT INTO `package_tracks` (`id`, `date_created`, `package_id`, `package_status`) VALUES
(1, '2/03/2022', '2', 'Picked Up Deliver');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email_id`, `first_name`, `last_name`, `password`, `user_role`) VALUES
(1, 'Arkam@gmail.com', 'Mohammed', 'Arkam', 'test123', 'SENDER'),
(2, 'Ismail@gmail.com', 'Mohammed', 'Ismail', 'test123', 'RECEIVER'),
(3, 'Irfan@gmail.com', 'Mohammed', 'Irfan', 'test123', 'RIDER');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `operation_center`
--
ALTER TABLE `operation_center`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `package`
--
ALTER TABLE `package`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `package_charges`
--
ALTER TABLE `package_charges`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `package_tracks`
--
ALTER TABLE `package_tracks`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `operation_center`
--
ALTER TABLE `operation_center`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `package`
--
ALTER TABLE `package`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `package_charges`
--
ALTER TABLE `package_charges`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `package_tracks`
--
ALTER TABLE `package_tracks`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
