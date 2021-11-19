-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2019 at 03:19 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `AdminID` int(11) NOT NULL,
  `Admin_Username` varchar(10) NOT NULL,
  `password` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AdminID`, `Admin_Username`, `password`) VALUES
(2, 'admin', 1234);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `DoctorID` int(225) NOT NULL,
  `Doctor_Username` varchar(10) NOT NULL,
  `DoctorPass` varchar(8) NOT NULL,
  `DoctorName` varchar(20) NOT NULL,
  `FathersName` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `ContactNo` varchar(20) NOT NULL,
  `Qualifications` varchar(100) NOT NULL,
  `Specialization` varchar(100) NOT NULL,
  `Gender` varchar(5) NOT NULL,
  `Bloodgroup` varchar(5) NOT NULL,
  `DateofJoining` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DoctorID`, `Doctor_Username`, `DoctorPass`, `DoctorName`, `FathersName`, `Email`, `ContactNo`, `Qualifications`, `Specialization`, `Gender`, `Bloodgroup`, `DateofJoining`, `Address`) VALUES
(2, 'doctor', '1234', 'doctor', 'doctor', 'doctor@gmail.com', '3456789', 'MBBS', 'Medicine', 'Male', 'O-', '12/12/0019', 'doctor');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `PatientID` int(11) NOT NULL,
  `Patient_Username` varchar(15) NOT NULL,
  `Patient_Password` varchar(10) NOT NULL,
  `PatientName` varchar(100) NOT NULL,
  `FathersName` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `ContactNo` int(100) NOT NULL,
  `Age` int(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `Bloodgroup` varchar(10) NOT NULL,
  `Adress` varchar(100) NOT NULL,
  `Remark` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`PatientID`, `Patient_Username`, `Patient_Password`, `PatientName`, `FathersName`, `Email`, `ContactNo`, `Age`, `Gender`, `Bloodgroup`, `Adress`, `Remark`) VALUES
(2, 'shahin', '121295', 'shahin', 'delwar hossain', 'shahinhasan557@gmail.com', 1710398443, 24, 'Male', 'A+', 'gopalganj', 'n/a	'),
(3, 'patient', '1234', 'patient', 'patient', 'patient@gmail.com', 234567, 22, 'Male', 'O-', 'patient', 'black foot');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`AdminID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`DoctorID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`PatientID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `AdminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `DoctorID` int(225) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `PatientID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
