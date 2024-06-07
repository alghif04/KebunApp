-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2024 at 05:17 AM
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
-- Database: `kebunappdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `komoditi`
--

CREATE TABLE `komoditi` (
  `Komoditi_id` int(11) NOT NULL,
  `Komoditi_nama` varchar(255) DEFAULT NULL,
  `Komoditi_harga` int(11) DEFAULT NULL,
  `Komoditi_satuan` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `Pelanggan_id` int(11) NOT NULL,
  `Pelanggan_nama` varchar(255) DEFAULT NULL,
  `Pelanggan_alamat` varchar(255) DEFAULT NULL,
  `Pelanggan_notelp` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`Pelanggan_id`, `Pelanggan_nama`, `Pelanggan_alamat`, `Pelanggan_notelp`) VALUES
(1, 'Kek', '111', '212'),
(2, 'test', '122', '222');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `Pesanan_id` varchar(255) NOT NULL,
  `Pesanan_nama` varchar(255) DEFAULT NULL,
  `Pesanan_tanggal` date DEFAULT NULL,
  `Pesanan_macamkomoditi` int(11) DEFAULT NULL,
  `Pesanan_totalharga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`Pesanan_id`, `Pesanan_nama`, `Pesanan_tanggal`, `Pesanan_macamkomoditi`, `Pesanan_totalharga`) VALUES
('1/Kebun/06-2024', 'test', '2024-06-03', NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `komoditi`
--
ALTER TABLE `komoditi`
  ADD PRIMARY KEY (`Komoditi_id`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`Pelanggan_id`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`Pesanan_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `komoditi`
--
ALTER TABLE `komoditi`
  MODIFY `Komoditi_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `Pelanggan_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
