-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2016 at 07:00 AM
-- Server version: 10.1.8-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gaji`
--

-- --------------------------------------------------------

--
-- Table structure for table `data1`
--

CREATE TABLE `data1` (
  `ID` int(30) NOT NULL,
  `Nama` varchar(40) NOT NULL,
  `Alamat` varchar(40) NOT NULL,
  `No HP` varchar(40) NOT NULL,
  `Posisi` varchar(30) NOT NULL,
  `Gaji Pokok` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data1`
--

INSERT INTO `data1` (`ID`, `Nama`, `Alamat`, `No HP`, `Posisi`, `Gaji Pokok`) VALUES
(1010, 'Anto Purba', 'Jln.Sriguntung banyu ungu', '0812456763', 'Marketing', 4000000),
(1011, 'Dina Galataria', 'Jln.Suka baru no 78', '08994555768', 'Surveyor', 3500000),
(1012, 'Tomhas Jono', 'Jln.walet no 16 ', '089633091708', 'Programmer', 5500000),
(1020, 'David Beckham', 'jln.cicarua no 7', '08112312324', 'Direktur', 8000000),
(1033, 'Geby andronissta', 'jln.kaplin no 56', '09579303231', 'Manager', 6000000),
(1044, 'Hartati leniansyah', 'jln.kapuas no 44', '089381311', 'Marketing', 4000000),
(1234, 'Bambang', 'jln merpati', '345', 'Programmer', 6000000);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `ID` int(30) DEFAULT NULL,
  `Nama` varchar(30) DEFAULT NULL,
  `Posisi` varchar(30) DEFAULT NULL,
  `Gaji Pokok` varchar(30) NOT NULL,
  `Pajak` varchar(30) DEFAULT NULL,
  `Jam Lembur` varchar(30) DEFAULT NULL,
  `Tunjangan Lembur` int(30) NOT NULL,
  `Total Gaji` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`ID`, `Nama`, `Posisi`, `Gaji Pokok`, `Pajak`, `Jam Lembur`, `Tunjangan Lembur`, `Total Gaji`) VALUES
(1011, 'Dina Galataria', 'Surveyor', '3500000', '35000', '10', 150000, '3615000'),
(1012, 'Tomhas Jono', 'Programmer', '5500000', '55000', '23', 345000, '5790000'),
(1044, 'Hartati leniansyah', 'Marketing', '4000000', '40000', '8', 120000, '4080000'),
(1033, 'Geby andronissta', 'Manager', '6000000', '60000', '10', 150000, '6090000'),
(1055, 'Budi Santosa', 'Surveyor', '3500000', '35000', '33', 495000, '3960000'),
(1234, 'Bambang', 'Programmer', '6000000', '60000', '10', 150000, '6090000');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
