-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2024 at 11:12 PM
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
-- Table structure for table `harga`
--

CREATE TABLE `harga` (
  `ID` int(11) NOT NULL,
  `Jenis` varchar(50) DEFAULT NULL,
  `Harga` decimal(10,2) DEFAULT NULL,
  `Satuan` enum('Kg','Pcs') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `harga`
--

INSERT INTO `harga` (`ID`, `Jenis`, `Harga`, `Satuan`) VALUES
(1, 'Kardus', 10000.00, 'Kg'),
(7, 'Koran', 3500.00, 'Pcs'),
(8, 'HVS', 1800.00, 'Kg'),
(9, 'Kertas Buram', 800.00, 'Kg'),
(10, 'Majalah', 700.00, 'Kg'),
(11, 'Duplek', 400.00, 'Kg'),
(12, 'Selang', 400.00, 'Kg'),
(13, 'Kresek', 300.00, 'Kg'),
(14, 'Botol Kecap', 300.00, 'Pcs'),
(15, 'Botol Bensin', 800.00, 'Pcs'),
(16, 'Pecahan Kaca', 50.00, 'Kg'),
(17, 'Gelas', 1500.00, 'Kg'),
(18, 'Kaleng', 1000.00, 'Kg'),
(19, 'Kemasan Saset', 50.00, 'Kg'),
(20, 'Kabel Listrik', 3000.00, 'Kg');

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
-- Table structure for table `laporanpanen`
--

CREATE TABLE `laporanpanen` (
  `Panen_id` int(11) NOT NULL,
  `Panen_tanggal` date DEFAULT NULL,
  `Panen_komoditi` varchar(255) DEFAULT NULL,
  `Panen_berat` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `laporanpanen`
--

INSERT INTO `laporanpanen` (`Panen_id`, `Panen_tanggal`, `Panen_komoditi`, `Panen_berat`) VALUES
(2, '2024-06-27', 'Asparagus', 3),
(3, '2024-06-14', 'Cabe', 3);

-- --------------------------------------------------------

--
-- Table structure for table `nasabah`
--

CREATE TABLE `nasabah` (
  `Nasabah_ID` int(11) NOT NULL,
  `Nasabah_NAMA` varchar(255) DEFAULT NULL,
  `Nasabah_STATUS` varchar(255) DEFAULT NULL,
  `Nasabah_NOMOR_RUMAH` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nasabah`
--

INSERT INTO `nasabah` (`Nasabah_ID`, `Nasabah_NAMA`, `Nasabah_STATUS`, `Nasabah_NOMOR_RUMAH`) VALUES
(10, 'Bayu', 'Kost', 27),
(11, 'Rohan', 'Tetap', 20),
(12, 'Rio', 'Tetap', 15),
(13, 'Yuda', 'Kost', 38),
(14, 'Lukman', 'Kontrak', 10),
(15, 'Bobby', 'Tetap', 12),
(16, 'Rizky', 'Kost', 21),
(17, 'Mayhikal', 'Tetap', 43),
(18, 'Diko', 'Kost', 52),
(19, 'Zico', 'Tetap', 56);

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
-- Table structure for table `penjualan_ke_bsis`
--

CREATE TABLE `penjualan_ke_bsis` (
  `id` int(11) NOT NULL,
  `no_transaksi` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `total_kg` decimal(10,2) NOT NULL,
  `total_biji` int(11) NOT NULL,
  `total_penjualan` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan_ke_bsis`
--

INSERT INTO `penjualan_ke_bsis` (`id`, `no_transaksi`, `tanggal`, `total_kg`, `total_biji`, `total_penjualan`) VALUES
(3, '22081010289', '2024-06-09', 100.00, 50, 10000.00),
(4, '22081010300', '2024-06-09', 90.00, 50, 15000.00),
(5, '22081010310', '2024-06-09', 91.00, 55, 20000.00),
(6, '22081010190', '2024-06-09', 190.00, 100, 28000.00),
(7, '22081010100', '2024-06-09', 100.00, 5, 29000.00);

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

-- --------------------------------------------------------

--
-- Table structure for table `setoran`
--

CREATE TABLE `setoran` (
  `ID` int(11) NOT NULL,
  `Tanggal_Setor` date DEFAULT NULL,
  `Nama` varchar(255) DEFAULT NULL,
  `Jenis` varchar(255) DEFAULT NULL,
  `Harga_Satuan` int(11) DEFAULT NULL,
  `kuantitas` double DEFAULT NULL,
  `Penerimaan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `setoran`
--

INSERT INTO `setoran` (`ID`, `Tanggal_Setor`, `Nama`, `Jenis`, `Harga_Satuan`, `kuantitas`, `Penerimaan`) VALUES
(1, '2024-06-07', 'Bayu Rachmawan', 'Kardus', 10000, 4, 40000),
(2, '2024-06-07', 'Bobby', 'Kertas Buram', 800, 3.5, 2800),
(3, '2024-06-06', 'Rio', 'Kresek', 300, 5.5, 1650),
(4, '2024-06-06', 'Mayhikal', 'HVS', 1800, 6, 10800),
(5, '2024-06-15', 'Rohan', 'Majalah', 700, 2.5, 1750),
(6, '2024-06-07', 'Rizky', 'Selang', 400, 2.5, 1000),
(7, '2024-06-06', 'Lukman', 'Kresek', 300, 7.5, 2250),
(8, '2024-06-22', 'Bayu', 'Kardus', 10000, 2, 20000),
(9, '2024-06-29', 'Rio', 'Kresek', 300, 2, 600);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `harga`
--
ALTER TABLE `harga`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `laporanpanen`
--
ALTER TABLE `laporanpanen`
  ADD PRIMARY KEY (`Panen_id`);

--
-- Indexes for table `nasabah`
--
ALTER TABLE `nasabah`
  ADD PRIMARY KEY (`Nasabah_ID`);

--
-- Indexes for table `penjualan_ke_bsis`
--
ALTER TABLE `penjualan_ke_bsis`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `setoran`
--
ALTER TABLE `setoran`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `harga`
--
ALTER TABLE `harga`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `laporanpanen`
--
ALTER TABLE `laporanpanen`
  MODIFY `Panen_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `nasabah`
--
ALTER TABLE `nasabah`
  MODIFY `Nasabah_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `penjualan_ke_bsis`
--
ALTER TABLE `penjualan_ke_bsis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `setoran`
--
ALTER TABLE `setoran`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
