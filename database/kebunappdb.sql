-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2024 at 02:33 PM
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
-- Table structure for table `detailpesanan`
--

CREATE TABLE `detailpesanan` (
  `id` int(11) NOT NULL,
  `pesanan_id` varchar(20) DEFAULT NULL,
  `komoditi_nama` varchar(50) DEFAULT NULL,
  `komoditi_harga` double DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `detailpesanan`
--

INSERT INTO `detailpesanan` (`id`, `pesanan_id`, `komoditi_nama`, `komoditi_harga`, `jumlah`) VALUES
(32, '1/Kebun/06-2024', 'Bayam', 10000, 2),
(33, '1/Kebun/06-2024', 'Pakcoy', 5000, 3),
(34, '1/Kebun/07-2024', 'Daun Bawang', 6250, 2),
(35, '1/Kebun/07-2024', 'Kangkung', 5000, 2),
(36, '2/Kebun/06-2024', 'Daun Bawang', 6250, 1),
(37, '2/Kebun/06-2024', 'Selada', 15000, 3),
(38, '2/Kebun/07-2024', 'Cabe', 20000, 1),
(39, '2/Kebun/07-2024', 'Pare', 7000, 4),
(40, '3/Kebun/06-2024', 'Cabe', 20000, 4),
(41, '3/Kebun/06-2024', 'Terong', 10000, 2),
(42, '3/Kebun/07-2024', 'Selada', 15000, 2),
(43, '3/Kebun/07-2024', 'Cabe', 20000, 5),
(44, '4/Kebun/06-2024', 'Jambu Biji', 10000, 4),
(45, '4/Kebun/06-2024', 'Kangkung', 5000, 1),
(46, '4/Kebun/07-2024', 'Daun Bawang', 6250, 2),
(47, '4/Kebun/07-2024', 'Jambu Biji', 10000, 8),
(48, '5/Kebun/06-2024', 'Kangkung', 5000, 1),
(49, '5/Kebun/06-2024', 'Bayam', 10000, 2),
(50, '5/Kebun/07-2024', 'Cabe', 20000, 3),
(51, '5/Kebun/07-2024', 'Kangkung', 5000, 5),
(52, '6/Kebun/06-2024', 'Terong', 10000, 3),
(53, '6/Kebun/06-2024', 'Jambu Biji', 10000, 3),
(54, '6/Kebun/07-2024', 'Kangkung', 5000, 5),
(55, '6/Kebun/07-2024', 'Pakcoy', 5000, 2),
(56, '7/Kebun/06-2024', 'Pakcoy', 5000, 3),
(57, '7/Kebun/06-2024', 'Selada', 15000, 2),
(58, '7/Kebun/07-2024', 'Daun Bawang', 6250, 3),
(59, '7/Kebun/07-2024', 'Bayam', 10000, 4),
(60, '8/Kebun/06-2024', 'Daun Bawang', 6250, 2),
(61, '8/Kebun/06-2024', 'Cabe', 20000, 4),
(62, '9/Kebun/06-2024', 'Bayam', 10000, 2),
(63, '9/Kebun/06-2024', 'Daun Bawang', 6250, 3),
(64, '10/Kebun/06-2024', 'Selada', 15000, 3),
(65, '10/Kebun/06-2024', 'Terong', 10000, 2),
(66, '11/Kebun/06-2024', 'Bayam', 10000, 3),
(67, '11/Kebun/06-2024', 'Terong', 10000, 2),
(68, '12/Kebun/06-2024', 'Terong', 10000, 2),
(69, '12/Kebun/06-2024', 'Jambu Biji', 10000, 1),
(70, '1/Kebun/06-2024', 'Daun Bawang', 6250, 3),
(71, '13/Kebun/06-2024', 'Kangkung', 5000, 2),
(72, '1/Kebun/06-2024', 'Asparagus', 3000, 2);

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

--
-- Dumping data for table `komoditi`
--

INSERT INTO `komoditi` (`Komoditi_id`, `Komoditi_nama`, `Komoditi_harga`, `Komoditi_satuan`) VALUES
(5, 'Bayam', 10000, 'Kg'),
(6, 'Pakcoy', 5000, 'Kg'),
(7, 'Daun Bawang', 6250, 'Kg'),
(8, 'Kangkung', 5000, 'Kg'),
(9, 'Selada', 15000, 'Kg'),
(10, 'Jambu Biji', 10000, 'Kg'),
(11, 'Cabe', 20000, 'Kg'),
(12, 'Kangkung', 5000, 'Kg'),
(13, 'Terong', 10000, 'Kg'),
(14, 'Pare', 7000, 'Kg'),
(15, 'Asparagus', 3000, 'Kg');

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
(12, '-', '-', '-'),
(13, 'Sudemo Aksara', 'Jalan Merdeka No. 123', '081234567890'),
(14, 'Budi Setiawan', 'Jalan Gajah Mada No. 456', '085678901234'),
(15, 'Ani Puspita', 'Jalan Diponegoro No. 789', '082345678901'),
(16, 'Joko Susanto', 'Jalan Ahmad Yani No. 10', '081987654321'),
(17, 'Rini Wijaya', 'Jalan Jendral Sudirman No. 15', '083123456789'),
(18, 'Ahmad Ramdhani', 'Jalan Gatot Subroto No. 20', '081876543210'),
(19, 'Dewi Anggraeni', 'Jalan Asia Afrika No. 30', '085432109876'),
(20, 'Anto Suprapto', 'Jalan Thamrin No. 35', '082345678901'),
(21, 'Citra Purnama', 'Jalan Cendrawasih No. 40', '081234567890'),
(22, 'Adi Santoso', 'Jalan Dipati Ukur No. 50', '084567890123'),
(23, 'Sari Indah', 'Jalan Otista No. 60', '085678901234'),
(24, 'Rizky Pratama', 'Jalan Kartini No. 70', '083890123456'),
(25, 'Bambang Suryadi', 'Jalan Sudirman No. 75', '087654321098'),
(26, 'Rina Sari', 'Jalan Gajah Mada No. 80', '082345678901'),
(27, 'Dodi Prasetyo', 'Jalan Ciliwung No. 90', '081234567890'),
(28, 'Rini Cahyani', 'Jalan Jenderal Sudirman No. 95', '085678901234'),
(29, 'Rudi Setiawan', 'Jalan Pangeran Diponegoro No. 100', '083456789012'),
(30, 'Yudi Hartanto', 'Jalan Dipati Ukur No. 110', '087654321098'),
(31, 'Dina Sari', 'Jalan Dr. Sutomo No. 120', '081234567890'),
(32, 'Eka Putra', 'Jalan Asia Afrika No. 130', '085678901234');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `Pesanan_id` varchar(255) NOT NULL,
  `Pesanan_nama` varchar(255) DEFAULT NULL,
  `Pesanan_tanggal` date DEFAULT NULL,
  `Pesanan_macamkomoditi` int(11) DEFAULT NULL,
  `Pesanan_totalharga` int(11) DEFAULT NULL,
  `pesanan_status` varchar(255) DEFAULT 'belum lunas'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`Pesanan_id`, `Pesanan_nama`, `Pesanan_tanggal`, `Pesanan_macamkomoditi`, `Pesanan_totalharga`, `pesanan_status`) VALUES
('1/Kebun/06-2024', 'Sudemo Aksara', '2024-06-08', 4, 59750, 'belum lunas'),
('1/Kebun/07-2024', 'Bambang Suryadi', '2024-07-01', 2, 22500, 'belum lunas'),
('10/Kebun/06-2024', 'Adi Santoso', '2024-06-17', 2, 65000, 'belum lunas'),
('11/Kebun/06-2024', 'Sari Indah', '2024-06-18', 2, 50000, 'lunas'),
('12/Kebun/06-2024', 'Rizky Pratama', '2024-06-19', 2, 30000, 'belum lunas'),
('13/Kebun/06-2024', 'Dodi Prasetyo', '2024-06-07', 1, 10000, 'belum lunas'),
('2/Kebun/06-2024', 'Budi Setiawan', '2024-06-09', 2, 51250, 'belum lunas'),
('2/Kebun/07-2024', 'Rina Sari', '2024-07-09', 2, 48000, 'lunas'),
('3/Kebun/06-2024', 'Ani Puspita', '2024-06-10', 2, 100000, 'belum lunas'),
('3/Kebun/07-2024', 'Rini Cahyani', '2024-07-10', 2, 130000, 'belum lunas'),
('4/Kebun/06-2024', 'Joko Susanto', '2024-06-11', 2, 45000, 'belum lunas'),
('4/Kebun/07-2024', 'Rudi Setiawan', '2024-07-11', 2, 92500, 'belum lunas'),
('5/Kebun/06-2024', 'Rini Wijaya', '2024-06-12', 2, 25000, 'lunas'),
('5/Kebun/07-2024', 'Yudi Hartanto', '2024-07-12', 2, 85000, 'lunas'),
('6/Kebun/06-2024', 'Ahmad Ramdhani', '2024-06-13', 2, 60000, 'lunas'),
('6/Kebun/07-2024', 'Dina Sari', '2024-07-13', 2, 35000, 'lunas'),
('7/Kebun/06-2024', 'Dewi Anggraeni', '2024-06-14', 2, 45000, 'belum lunas'),
('7/Kebun/07-2024', 'Eka Putra', '2024-07-14', 2, 58750, 'lunas'),
('8/Kebun/06-2024', 'Anto Suprapto', '2024-06-15', 2, 92500, 'lunas'),
('9/Kebun/06-2024', 'Citra Purnama', '2024-06-16', 2, 38750, 'belum lunas');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detailpesanan`
--
ALTER TABLE `detailpesanan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pesanan_id` (`pesanan_id`);

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
-- AUTO_INCREMENT for table `detailpesanan`
--
ALTER TABLE `detailpesanan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- AUTO_INCREMENT for table `komoditi`
--
ALTER TABLE `komoditi`
  MODIFY `Komoditi_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `Pelanggan_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detailpesanan`
--
ALTER TABLE `detailpesanan`
  ADD CONSTRAINT `detailpesanan_ibfk_1` FOREIGN KEY (`pesanan_id`) REFERENCES `pesanan` (`Pesanan_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
