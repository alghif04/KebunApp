-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Jun 2024 pada 11.38
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perkebunan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `komoditi`
--

CREATE TABLE `komoditi` (
  `id_komoditi` int(11) NOT NULL,
  `nama_komoditi` varchar(225) NOT NULL,
  `harga_komoditi` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `panen`
--

CREATE TABLE `panen` (
  `id_panen` int(11) NOT NULL,
  `nama_hasil_panen` varchar(225) NOT NULL,
  `berat_panen` float NOT NULL,
  `bagian_hasil_panen` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` int(11) NOT NULL,
  `nama_pelanggan` varchar(225) NOT NULL,
  `nomor_pelanggan` varchar(225) NOT NULL,
  `alamat_pelanggan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesanan`
--

CREATE TABLE `pesanan` (
  `id_pesanan` int(11) NOT NULL,
  `nama_pemesan` varchar(225) NOT NULL,
  `nama_pesanan` varchar(225) NOT NULL,
  `kuantitas_pesanan` float NOT NULL,
  `harga_pesanan` varchar(225) NOT NULL,
  `total_harga_pesanan` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pesanan`
--

INSERT INTO `pesanan` (`id_pesanan`, `nama_pemesan`, `nama_pesanan`, `kuantitas_pesanan`, `harga_pesanan`, `total_harga_pesanan`) VALUES
(1, 'Andi', 'Kangkung', 2, '12.000', '24'),
(2, 'Mira', 'Brokoli', 3, '9.000', '27');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `komoditi`
--
ALTER TABLE `komoditi`
  ADD PRIMARY KEY (`id_komoditi`);

--
-- Indeks untuk tabel `panen`
--
ALTER TABLE `panen`
  ADD PRIMARY KEY (`id_panen`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indeks untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id_pesanan`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `komoditi`
--
ALTER TABLE `komoditi`
  MODIFY `id_komoditi` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `panen`
--
ALTER TABLE `panen`
  MODIFY `id_panen` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id_pelanggan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `id_pesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
