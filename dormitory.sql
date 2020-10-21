-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 21, 2020 at 05:34 AM
-- Server version: 5.7.17-log
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dormitory`
--

-- --------------------------------------------------------

--
-- Table structure for table `oauth_role`
--

CREATE TABLE `oauth_role` (
  `id` int(11) NOT NULL,
  `role_name` varchar(50) DEFAULT NULL,
  `role_status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `oauth_role`
--

INSERT INTO `oauth_role` (`id`, `role_name`, `role_status`) VALUES
(1, 'ROLE_ADMIN', 'active'),
(2, 'ROLE_USER', 'active'),
(3, 'ROLE_DORM', 'active');

-- --------------------------------------------------------

--
-- Table structure for table `oauth_user`
--

CREATE TABLE `oauth_user` (
  `id` int(11) NOT NULL,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `citizen` varchar(13) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `tel` varchar(10) DEFAULT NULL,
  `role` int(1) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `role_entity_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table user for auth';

--
-- Dumping data for table `oauth_user`
--

INSERT INTO `oauth_user` (`id`, `first_name`, `last_name`, `username`, `password`, `citizen`, `email`, `gender`, `tel`, `role`, `status`, `role_entity_id`) VALUES
(45, 'sita', 'sita', 'sita', '$2a$10$tu4zO7sEmGAn.NBG/qwiEu6KVxlMHiDOcsO6ASKg0hRLdBvNq2h7e', '1326325589658', 'sita@gmail.com', 'หญิง', '0878155126', 3, 'active', NULL),
(46, 'สไมล์', 'เพลส', 'smile', '$2a$10$iDhezGMG9VQy3U/ExjvFO.6Z1nFdyoWhMrevPyXdFhRhSmjImKTze', '1425659659658', ' SmilePlace@gmail.com', 'หญิง', '0979322339', 3, 'active', NULL),
(47, 'ทับทิม', 'หอพัก', 'tubtim', '$2a$10$dyuaqI8G60OtUgg8k9H/Tu31oos3pnpdDo3wLIce0SZb/fFtG2HNS', '1332626596589', 'tubtim@gmail.com', 'หญิง', '0833299469', 3, 'active', NULL),
(48, 'เบลสซิ่ง', 'เฮ้าส์', 'blessing', '$2a$10$uDgfhV/G/XLpZSnXzKoaIec5axONbhm1pJWEueF0OcQbR67REzIUm', '1456596596585', 'blessing@gmail.com', 'ชาย', '0898636338', 3, 'active', NULL),
(49, 'อัสมา', 'อพาร์ทเมนท์', 'ausma', '$2a$10$DgUZVH1j0VBR2Yf/mHlh3O8eoBxiLGhzA/bbRxJGmkej8NcWBXShq', '1445659656986', 'ausma@gmail.com', 'หญิง', '0951892802', 3, 'active', NULL),
(50, 'ยูโฮม', 'มหาสารคาม', 'uhome', '$2a$10$LyxrMsLuObCeiw0zmG6BxezNizaZWdyx7iVoL93ockBkcRn8GKNmq', '1336596596589', 'uhome', 'หญิง', '0806071644', 3, 'active', NULL),
(51, 'ระภาพันธ์', 'หอพักหญิง', 'rapha', '$2a$10$CWxPRE1MdEuAe7pF9x95PuqCWXiTisISVcOQ/Ed8WQgX5CLhBGzkO', '1465965898455', 'rapha@gmail.com', 'หญิง', '0813209050', 3, 'active', NULL),
(52, 'คุณย่า', 'หอพักหญิง', 'kunya', '$2a$10$xjIDIgGCeUbPtKymrd/kluzV0B7egR3at1AVjEisjfhQ0hGrCcat2', '1462569658659', 'kunya@gmail.com', 'หญิง', '0857602086', 3, 'active', NULL),
(53, 'ลีลาวดี', 'หอพัก', 'rerawadee', '$2a$10$ZgaCjhFY3W8NBVVRHyMmyOaayVp3kSvOO3S9nUZWKLWSZcALMMuiy', '1440252659658', 'rerawadee@gmail.com', 'หญิง', '0836617450', 3, 'active', NULL),
(54, 'เฟรม', 'ฟร้อนท์', 'fame', '$2a$10$KHg.2/pZc/lqWzZW9TiIo.QmIJdWQqPn7fcG.sqApFgn0uoXCLj9C', '1365965895644', 'fame@gmail.com', 'ชาย', '0910526943', 3, 'active', NULL),
(55, 'np', 'House', 'nphouse', '$2a$10$qLbPylZVnUU3Kcc.jgM8iu/gm2yoc1/hrM9bm320sAa7udv9RW9UG', '1252632596557', 'nphouse@gmail.com', 'ชาย', '0885112770', 3, 'active', NULL),
(56, 'ทิฆัมพร', 'เพลส', 'ticomeporn', '$2a$10$ARlLgC2d3UqF3NE14OubnOI5c5RYPhTBMhq16lCyp.6G05mJZdxWK', '1232363659854', 'ticomeporn@gmail.com', 'หญิง', '0867901545', 3, 'active', NULL),
(57, 'ปภาวรินทร์', 'อพาร์ทเมนท์', 'paphawalin', '$2a$10$fHI9pRUF8zou6rCG5VVeEuxzPJWgkMuTuhkZ84zoDcyiGGV1USSlm', '1326235696587', 'paphawalin@gmail.com', 'หญิง', '0845253655', 3, 'active', NULL),
(58, 'ยิ่งเจริญ', 'อพาร์ทเม้นท์', 'yengja', '$2a$10$VhLXnYtZnm7uTn41Ac8gxOOT3zYOe1Pgpa6fhf5gJ7S9pcVuZtBZq', '1423266596588', 'yengja@gmail.com', 'หญิง', '0945910827', 3, 'active', NULL),
(59, 'เดอะไนน์', 'เฮ้าส์', 'thenight', '$2a$10$9tG4aMx22ddaLfQTawJqMuOHn6s2pFyh0dMSlVd03UVku0AoY1HUu', '1446256596589', 'thenight@gmail.com', 'หญิง', '0819740687', 3, 'active', NULL),
(60, 'อรสริน', 'เพลส', 'aornsalin', '$2a$10$s.8/vannQf1EGejCjc2TNuVjqvMYPzIlTW1A4OUzBicRt7Pc5vu5a', '1245659658745', 'aornsalin@gmail.com', 'หญิง', '0933261662', 3, 'active', NULL),
(61, 'บ้านสวน', 'สารคาม2', 'bhansuan', '$2a$10$FUK0AziRjzXiV9NMMjGqXOHBTd2sGrZJTaVqBgQuy5QBOfJKmmpfq', '1245876552669', 'bhansuan@gmail.com', 'หญิง', '0910387594', 3, 'active', NULL),
(62, 'พรวลัย', 'อพาร์ทเม้นท์', 'pornwarai', '$2a$10$3bqQtXjDt4EFH./A/27lf.C5goG9mXKaF3hHjGjWPHiDVdYaJHThS', '1442526265968', 'pornwarai@gmail.com', 'หญิง', '0863987655', 3, 'active', NULL),
(63, 'ฉัตรเพชร', 'อาพาร์ทเม้นท์', 'chutpet', '$2a$10$4WLFshFMAMEPniLuilJWB.tM5lHi4jEOGvjyLp/x4E2g9XlixTdki', '1332659658659', 'chutpet@gmail.com', 'หญิง', '0891182099', 3, 'active', NULL),
(64, 'ปิยดิศ', 'เพลส', 'piyadit', '$2a$10$C8qB4.kfJ6NeckLLRlNaQu84Amj4zheML0QCXJ62fpuRZs/ki/k6K', '1332650256985', 'piyadit@gmail.com', 'ชาย', '0864033350', 3, 'active', NULL),
(65, 'สถาพร', 'สุรักษ์', 'satha', '$2a$10$LOLC56UWwSnmOD/YJeO4U.d1L1.wJZ7sSOzb8X3PX/JODTIMRKEM6', '1440600265964', 'sathapornsurak@gmail.com', 'ชาย', '0922940286', 2, NULL, NULL),
(66, 'test', 'test', 'test', '$2a$10$Abzn1IXmAUm6aKydZX/83O/R5MWGFxMYB/5PoenQRvWBW3PXvOulS', '1440232632596', 'test@gmail.com', 'ชาย', '0923236585', 3, 'active', NULL),
(67, 'tesa', 'tesa', 'asza', '$2a$10$wYJcQX9m3PWytPYx9vKn/OhZHTgIj6/BIIfV5dGxpSX6bI5w/FAr.', '1414256325696', 'sadfsadf@gmail.com', 'ชาย', '0922959589', 2, 'active', NULL),
(68, 'นายก', 'ไก่', 'testdorm', '$2a$10$1G67L94JFHN8Tonl7ZF30OHGjHONQPc2Et/ZLgiQOnaJ.oimdevha', '1426236596589', 'testdorm@gmail.com', 'หญิง', '0922659659', 3, 'active', NULL),
(69, 'สถาพร', 'สุรัก', 'sathaporn', '$2a$10$TZmU6u9lRONvLRYerYSldeZgKRBiNB6Gb2kh3JHbJNYPk0X9/fqAi', '1440600265964', 'sathapornsurak@gmail.com', 'ชาย', '0922940286', 3, 'active', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tb_convenient`
--

CREATE TABLE `tb_convenient` (
  `con_id` int(11) NOT NULL,
  `dorm_id` int(11) NOT NULL,
  `con_wifi` varchar(100) NOT NULL,
  `con_park` varchar(255) NOT NULL,
  `con_washing` varchar(100) NOT NULL,
  `con_waterfilter` varchar(100) NOT NULL,
  `con_keycard` varchar(100) NOT NULL,
  `con_pet` varchar(100) NOT NULL,
  `con_securitycctv` varchar(100) NOT NULL,
  `con_smoking` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_convenient`
--

INSERT INTO `tb_convenient` (`con_id`, `dorm_id`, `con_wifi`, `con_park`, `con_washing`, `con_waterfilter`, `con_keycard`, `con_pet`, `con_securitycctv`, `con_smoking`) VALUES
(1, 40, 'มี', 'ที่จอดรถจักรยานยนต์ และที่จอดรถยนต์กว้างขวาง', 'มี', 'ไม่มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(2, 41, 'มี', 'ที่จอดรถจักรยานยนต์ และที่จอดรถยนต์กว้างขวาง', 'มี', 'ไม่มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(3, 42, 'มี', 'ที่จอดรถจักรยานยนต์กว้างขวาง', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(4, 43, 'มี', 'ที่จอดรถจักรยานยนต์กว้างขวาง', 'มี', 'มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(5, 44, 'มี', 'ที่จอดรถจักรยานยนต์ และที่จอดรถยนต์กว้างขวาง', 'มี', 'มี', 'ไม่มี', 'ห้ามเลี้ยง', 'ไม่มี', 'ห้ามสูบบุหรี่'),
(6, 45, 'มี', 'ที่จอดรถจักรยานยนต์ และที่จอดรถยนต์กว้างขวาง', 'ไม่มี', 'มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(7, 46, 'มี', 'ที่จอดรถจักรยานยนต์กว้างขวาง', 'มี', 'มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(8, 47, 'มี', 'ที่จอดรถจักรยานยนต์ และที่จอดรถยนต์กว้างขวาง', 'มี', 'ไม่มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(9, 48, 'มี', 'มีที่จอดรถจักรยานยนต์ และที่จอดรถยนต์', 'มี', 'ไม่มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(10, 49, 'มี', 'มีที่จอดรถจักรยานยนต์ และที่จอดรถยนต์', 'มี', 'มี', 'มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(11, 50, 'มี', 'มีที่จอดรถจักรยานยนต์ และที่จอดรถยนต์', 'ไม่มี', 'มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(12, 51, 'มี', 'มีจอดรถจักรยานยนต์', 'มี', 'มี', 'มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(13, 52, 'มี', 'ที่จอดรถจักรยานยนต์ และที่จอดรถยนต์กว้างขวาง', 'ไม่มี', 'ไม่มี', 'มี', 'ห้ามเลี้ยง', 'มี', '	\r\nห้ามสูบบุหรี่\r\n'),
(14, 53, 'มี', 'มีจอดรถจักรยานยนต์', 'ไม่มี', 'ไม่มี', 'มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(15, 54, 'มี', 'มีจอดรถจักรยานยนต์', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(16, 55, 'มี', 'ที่จอดรถจักรยานยนต์ และที่จอดรถยนต์กว้างขวาง', 'มี', 'มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(17, 56, 'มี', 'มีจอดรถจักรยานยนต์', 'มี', 'ไม่มี', 'ไม่มี', 'เลี้ยงได้', 'ไม่มี', 'ห้ามสูบบุหรี่'),
(18, 57, 'มี', 'มีที่จอดรถจักรยานยนต์ และที่จอดรถยนต์', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(19, 58, 'มี', 'มีจอดรถจักรยานยนต์', 'มี', 'ไม่มี', 'มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(20, 59, 'มี', 'มีที่จอดรถจักรยานยนต์ และที่จอดรถยนต์', 'มี', 'มี', 'มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(26, 67, 'ไม่มี', 'teset', 'ไม่มี', 'มี', 'มี', 'เลี้ยงได้', 'ไม่มี', 'สูบบุหรี่ได้'),
(28, 68, 'มี', 'มีที่จอดรถยนต์และรถจักรยานยนต์', 'มี', 'ไม่มี', 'มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่'),
(29, 69, 'มี', 'มีที่จอดรถกว้างขวาง', 'มี', 'ไม่มี', 'มี', 'ห้ามเลี้ยง', 'มี', 'ห้ามสูบบุหรี่');

-- --------------------------------------------------------

--
-- Table structure for table `tb_dorm`
--

CREATE TABLE `tb_dorm` (
  `dorm_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `dorm_name` varchar(100) NOT NULL,
  `dorm_address` varchar(255) NOT NULL,
  `dorm_numbank` varchar(100) NOT NULL,
  `dorm_namebank` varchar(100) NOT NULL,
  `type_id` int(11) NOT NULL,
  `dorm_waterbill` varchar(100) NOT NULL,
  `dorm_electricbill` varchar(100) NOT NULL,
  `dorm_img` varchar(255) NOT NULL,
  `dorm_pricedate_start` decimal(14,2) NOT NULL,
  `dorm_pricedate_end` decimal(14,2) NOT NULL,
  `dorm_pricemonth_start` decimal(14,2) NOT NULL,
  `dorm_pricemonth_end` decimal(14,2) NOT NULL,
  `dorm_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_dorm`
--

INSERT INTO `tb_dorm` (`dorm_id`, `id`, `dorm_name`, `dorm_address`, `dorm_numbank`, `dorm_namebank`, `type_id`, `dorm_waterbill`, `dorm_electricbill`, `dorm_img`, `dorm_pricedate_start`, `dorm_pricedate_end`, `dorm_pricemonth_start`, `dorm_pricemonth_end`, `dorm_status`) VALUES
(40, 45, 'หอพักศิตา', 'ซ.29/1 ถ.ศรีสวัสดิ์ดำเนิน ตลาด เมืองมหาสารคาม มหาสารคาม', '1234232525', 'กรุงไทย', 1, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'sita.jpg', '350.00', '380.00', '3500.00', '3600.00', 'รายเดือน-รายวัน'),
(41, 46, 'สไมล์ เพลส', 'ซ.หมู่บ้านดอนเวียงจันทร์ ถ.หน้าป้ายมมส.ใหม่ ท่าขอนยาง กันทรวิชัย มหาสารคาม', '1252569658', 'กรุงไทย', 1, '22', '8', 'smile.jpg', '0.00', '0.00', '3700.00', '8000.00', 'รายเดือน'),
(42, 47, 'บ้านทับทิม', 'ซ.ริมคลองสมถวิล 23 ถ.ริมคลองสมถวิล ตลาด เมืองมหาสารคาม มหาสารคาม', '1256596589', 'กรุงไทย', 1, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'tubtim.jpg', '0.00', '0.00', '2500.00', '3500.00', 'รายเดือน'),
(43, 48, 'เบลสซิ่งเฮ้าส์', 'ซ.ตรงข้าม ธ.ออมสิน สาขาท่าขอนยาง ถ.หมู่ 1 ท่าขอนยาง กันทรวิชัย มหาสารคาม', '1252659658', 'กสิกร', 1, '20', '8', 'bless.jpg', '0.00', '0.00', '2600.00', '3000.00', 'รายเดือน'),
(44, 49, 'อัสมาอพาร์ทเมนท์', 'ซ.ผดุงวิถี1 ถ.ผดุงวิถี ตลาด เมืองมหาสารคาม มหาสารคาม', '1256459759', 'กสิกร', 2, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'ausma.jpg', '0.00', '0.00', '2000.00', '3000.00', 'รายเดือน'),
(45, 50, 'ยูโฮม มหาสารคาม', 'ซ.23/3 ถ.ริมคลองสมถวิล ตลาด เมืองมหาสารคาม มหาสารคาม', '1252569658', 'กรุงไทย', 1, '25', '7', 'uhome.jpg', '0.00', '0.00', '3000.00', '0.00', 'รายเดือน'),
(46, 51, 'หอพักหญิงระภาพันธ์', 'ซ.นครสวรรค์2/4 ถ.นครสวรรค์ ตลาด เมืองมหาสารคาม มหาสารคาม', '1236359589', 'กสิกร', 1, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'rapha.jpg', '0.00', '0.00', '2300.00', '2400.00', 'รายเดือน'),
(47, 52, 'หอพักหญิงคุณย่า', 'ซ.นครสวรรค์4/1 ถ.นครสวรรค์ ตลาด เมืองมหาสารคาม มหาสารคาม', '1256596589', 'กสิกร', 1, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'kunya.jpg', '0.00', '0.00', '2200.00', '0.00', 'รายเดือน'),
(48, 53, 'หอพักลีลาวดี', 'ถ.มหาวิทยาลัยมหาสารคาม ท่าขอนยาง กันทรวิชัย มหาสารคาม', '1356596588', 'กรุงไทย', 1, '18', '8', 'rerawadee.jpg', '400.00', '0.00', '2400.00', '3000.00', 'รายเดือน-รายวัน'),
(49, 54, 'หอพักเฟรม&ฟร้อนท์', 'ซ.ริมคลองสมถวิล47 ถ.ริมคลองสมถวิล ตลาด เมืองมหาสารคาม มหาสารคาม', '1025485965', 'กสิกร', 1, '100/คน', '10', 'fame.jpg', '400.00', '0.00', '2700.00', '3400.00', 'รายเดือน-รายวัน'),
(50, 55, 'N.P.House', 'ซ.27 ถ.ริมคลองสมถวิล ตลาด เมืองมหาสารคาม มหาสารคาม', '1252362554', 'กรุงไทย', 1, '20', '8', 'np.jpg', '300.00', '400.00', '2000.00', '3000.00', 'รายเดือน-รายวัน'),
(51, 56, 'ทิฆัมพรเพลส', 'ซ.วุ่นวาย ท่าขอนยาง กันทรวิชัย มหาสารคาม', '1023259658', 'กสิกร', 1, '25', '7', 'ticomeporn.jpg', '0.00', '0.00', '3500.00', '3800.00', 'รายเดือน'),
(52, 57, 'ปภาวรินทร์ อพาร์ทเมนท์', 'ซ.23/4 ถ.สมถวิลราษฎร์ ตลาด เมืองมหาสารคาม มหาสารคาม', '1202565965', 'กสิกร', 2, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'paphawalin.jpg', '350.00', '450.00', '2500.00', '2800.00', 'รายเดือน-รายวัน'),
(53, 58, 'ยิ่งเจริญอพาร์ทเม้นท์', 'ท่าขอนยาง กันทรวิชัย มหาสารคาม', '1215486598', 'กรุงไทย', 2, '25', '8', 'yengja.jpg', '0.00', '0.00', '2900.00', '3300.00', 'รายเดือน'),
(54, 59, 'เดอะไนน์เฮ้าส์', 'ซ.โพธิ์ทอง ขามเรียง กันทรวิชัย มหาสารคาม', '1202585869', 'กสิกร', 1, '22', '7', 'thenight.jpg', '0.00', '0.00', '3500.00', '0.00', 'รายเดือน'),
(55, 60, 'หอพัก อร-สริน เพลส', 'ซ.19 ถ.ริมคลองสมถวิล ตลาด เมืองมหาสารคาม มหาสารคาม', '1202325659', 'กรุงไทย', 1, '150/คน', '8', 'aornsalin.jpg', '300.00', '500.00', '3000.00', '5500.00', 'รายเดือน-รายวัน'),
(56, 61, 'บ้านสวนสารคาม2', 'ขามเรียง กันทรวิชัย มหาสารคาม', '1023695874', 'กสิกร', 1, '20', '7', 'bhansuan.jpg', '0.00', '0.00', '2200.00', '3300.00', 'รายเดือน'),
(57, 62, 'พรวลัย อพาร์ทเม้นท์', 'ขามเรียง กันทรวิชัย มหาสารคาม', '1023265968', 'กสิกร', 2, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'pornwarai.jpg', '0.00', '0.00', '3500.00', '4500.00', 'รายเดือน'),
(58, 63, 'ฉัตรเพชรอาพาร์ทเม้นท์', 'ตลาด เมืองมหาสารคาม มหาสารคาม', '1202565858', 'กรุงไทย', 2, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'chutpet.jpg', '250.00', '400.00', '2100.00', '2600.00', 'รายเดือน-รายวัน'),
(59, 64, 'ปิยดิศ เพลส', 'ซ.ศรีสวัสดิ์ดำเนิน ถ.ซอย 27/1 ตลาด เมืองมหาสารคาม มหาสารคาม', '1203223258', 'กสิกร', 1, 'กรุณาโทรสอบถาม', 'กรุณาโทรสอบถาม', 'piyadit.jpg', '0.00', '0.00', '3000.00', '3800.00', 'รายเดือน'),
(67, 66, 'test', 'test', '1212121212', 'test', 2, 'a', 'a', 'iconhome.jpg', '1.00', '1.00', '1.00', '2.00', 'รายเดือน'),
(68, 68, 'หอพัก ก.ไก่', 'มหาสารคาม', '1203263259', 'กรุงไทย', 1, '25', '8', '100305_3028.jpeg', '0.00', '0.00', '3500.00', '4000.00', 'รายเดือน'),
(69, 69, 'หอพักสถาพร', 'มหาสารคาม', '1202123232', 'กสิกร', 1, '22', '8', '120164860_3556641961054597_9048640288100047351_n.jpg', '0.00', '0.00', '2000.00', '3000.00', 'รายเดือน'),
(70, 69, 'หอพักสถาพร2', 'มหาสารคาม', '121236325659', 'กรุงไทย', 2, '0', '0', '120161990_832537063952681_6713144204012499725_n.jpg', '700.00', '800.00', '0.00', '0.00', 'รายวัน');

-- --------------------------------------------------------

--
-- Table structure for table `tb_dormtype`
--

CREATE TABLE `tb_dormtype` (
  `type_id` int(11) NOT NULL,
  `type_name` varchar(100) NOT NULL,
  `type_detail` varchar(255) NOT NULL,
  `type_status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_dormtype`
--

INSERT INTO `tb_dormtype` (`type_id`, `type_name`, `type_detail`, `type_status`) VALUES
(1, 'หอพัก', '0', 'active'),
(2, 'อพาร์ทเมนท์', '0', 'active');

-- --------------------------------------------------------

--
-- Table structure for table `tb_member`
--

CREATE TABLE `tb_member` (
  `mem_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `dorm_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `mem_ref` varchar(255) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `citizen` varchar(13) NOT NULL,
  `email` varchar(100) NOT NULL,
  `tel` varchar(10) NOT NULL,
  `mem_reserdate` varchar(50) NOT NULL,
  `mem_guest` int(10) NOT NULL,
  `date_of_stay` varchar(50) NOT NULL,
  `deposit` decimal(14,2) NOT NULL,
  `deposit_status` varchar(50) NOT NULL,
  `mem_img` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_member`
--

INSERT INTO `tb_member` (`mem_id`, `id`, `dorm_id`, `room_id`, `mem_ref`, `first_name`, `last_name`, `citizen`, `email`, `tel`, `mem_reserdate`, `mem_guest`, `date_of_stay`, `deposit`, `deposit_status`, `mem_img`) VALUES
(1, 0, 41, 13, '01-10-2020 14:07:15', 'สถาพร', 'สุรักษ์', '1440600265964', 'sathapornsurak@gmail.com', '0922940286', '01-10-2020', 1, '2020-10-02', '1110.00', 'ชำระแล้ว', '83318263_271071527284377_6576420423028437199_n.jpg'),
(2, 65, 42, 23, '01-10-2020 14:09:15', 'สถาพร', 'สุรักษ์', '1440600265964', 'sathapornsurak@gmail.com', '0922940286', '01-10-2020', 2, '2020-10-03', '750.00', 'ชำระแล้ว', '120324894_838934029980272_1935589379418155398_n.jpg'),
(3, 0, 67, 140, '01-10-2020 15:23:06', 'a', 'a', '123121212122', 'a', '0232659658', '01-10-2020', 3, '2020-10-03', '0.30', 'รอการตรวจสอบ', '120111024_681569359127426_3839035309296532380_n.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tb_payment`
--

CREATE TABLE `tb_payment` (
  `pay_id` int(11) NOT NULL,
  `mem_id` int(11) NOT NULL,
  `dorm_id` int(11) NOT NULL,
  `pay_pic` varchar(255) NOT NULL,
  `pay_price` varchar(100) NOT NULL,
  `pay_date` varchar(50) NOT NULL,
  `pay_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tb_room`
--

CREATE TABLE `tb_room` (
  `room_id` int(11) NOT NULL,
  `dorm_id` int(11) NOT NULL,
  `room_num` varchar(10) NOT NULL,
  `room_img` varchar(255) NOT NULL,
  `room_price` decimal(14,2) NOT NULL,
  `room_waterheater` varchar(10) NOT NULL,
  `room_tv` varchar(10) NOT NULL,
  `room_refrigerator` varchar(10) NOT NULL,
  `room_air` varchar(10) NOT NULL,
  `room_fan` varchar(10) NOT NULL,
  `room_status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_room`
--

INSERT INTO `tb_room` (`room_id`, `dorm_id`, `room_num`, `room_img`, `room_price`, `room_waterheater`, `room_tv`, `room_refrigerator`, `room_air`, `room_fan`, `room_status`) VALUES
(3, 40, '101', '1sita.jpg', '3500.00', 'มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(4, 40, '102', '1sita.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(5, 40, '103', '1sita.jpg', '3500.00', 'มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(6, 40, '104', '1sita.jpg', '3500.00', 'มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(7, 40, '105', '1sita.jpg', '3600.00', 'มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(8, 40, '106', '1sita.jpg', '3500.00', 'มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(9, 40, '107', '1sita.jpg', '3500.00', 'มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(10, 40, '108', '1sita.jpg', '3500.00', 'ไม่มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(11, 40, '109', '1sita.jpg', '3500.00', 'ไม่มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(12, 40, '110', '1sita.jpg', '3500.00', 'มี', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(13, 41, '101', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(14, 41, '102', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(15, 41, '103', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(16, 41, '104', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(17, 41, '105', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(18, 41, '106', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(19, 41, '107', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(20, 41, '108', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(21, 41, '109', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(22, 41, '110', '1smile.jpg', '3700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(23, 42, '101', '1tubtim.jpg', '2500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(24, 42, '102', '1tubtim.jpg', '2500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(25, 42, '103', '1tubtim.jpg', '2500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(26, 42, '104', '1tubtim.jpg', '2500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(27, 42, '105', '1tubtim.jpg', '2500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(28, 42, '106', '1tubtim.jpg', '2500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(29, 42, '107', '1tubtim.jpg', '2800.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(33, 42, '108', '1tubtim.jpg', '2500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(34, 42, '109', '1tubtim.jpg', '2500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(35, 42, '110', '1tubtim.jpg', '2800.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(36, 43, '101', '1bless.jpg', '2600.00', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(37, 43, '102', '1bless.jpg', '2600.00', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(38, 43, '103', '1bless.jpg', '2600.00', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(39, 43, '104', '1bless.jpg', '2600.00', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(40, 43, '105', '1bless.jpg', '2600.00', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ไม่มี', 'ว่าง'),
(41, 44, '101', '1ausma.jpg', '2000.00', 'มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(42, 44, '102', '1ausma.jpg', '2600.00', 'มี', 'มี', 'มี', 'ไม่มี', 'มี', 'ว่าง'),
(43, 44, '103', '1ausma.jpg', '2000.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(44, 44, '104', '1ausma.jpg', '3000.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(45, 44, '105', '1ausma.jpg', '2500.00', 'มี', 'ไม่มี', 'มี', 'ไม่มี', 'มี', 'ว่าง'),
(46, 45, '101', '1uhome.jpg', '3000.00', 'มี', 'มี', 'ไม่มี', 'มี', 'มี', 'ว่าง'),
(47, 45, '102', '1uhome.jpg', '3000.00', 'มี', 'มี', 'ไม่มี', 'มี', 'มี', 'ว่าง'),
(48, 45, '103', '1uhome.jpg', '3000.00', 'มี', 'มี', 'ไม่มี', 'มี', 'มี', 'ว่าง'),
(49, 45, '104', '1uhome.jpg', '3000.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(50, 45, '105', '1uhome.jpg', '3000.00', 'มี', 'มี', 'ไม่มี', 'มี', 'มี', 'ว่าง'),
(51, 46, '101', '1rapha.jpg', '2300.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(52, 46, '102', '1rapha.jpg', '2300.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(53, 46, '103', '1rapha.jpg', '2300.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(54, 46, '104', '1rapha.jpg', '2300.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(55, 46, '105', '1rapha.jpg', '2300.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(56, 47, '101', '1kunya.jpg', '2200.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(57, 47, '102', '1kunya.jpg', '2200.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(58, 47, '103', '1kunya.jpg', '2200.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(59, 47, '104', '1kunya.jpg', '2200.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(60, 47, '105', '1kunya.jpg', '2200.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(61, 48, '101', '1rerawadee.jpg', '2400.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(62, 48, '102', '1rerawadee.jpg', '2400.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(63, 48, '103', '1rerawadee.jpg', '2400.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(64, 48, '104', '1rerawadee.jpg', '2400.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(65, 48, '105', '1rerawadee.jpg', '2400.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(66, 49, '101', '1fame.jpg', '2700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(67, 49, '102', '1fame.jpg', '2700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(68, 49, '103', '1fame.jpg', '2700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(69, 49, '104', '1fame.jpg', '2700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(70, 49, '105', '1fame.jpg', '2700.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(71, 50, '101', '1np.jpg', '2000.00', 'ไม่มี', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(72, 50, '102', '1np.jpg', '2000.00', 'ไม่มี', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(73, 50, '103', '1np.jpg', '2000.00', 'ไม่มี', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(74, 50, '104', '1np.jpg', '2000.00', 'ไม่มี', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(75, 50, '105', '1np.jpg', '2000.00', 'ไม่มี', 'มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(76, 51, '101', '1ticomeporn.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(77, 51, '102', '1ticomeporn.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(78, 51, '103', '1ticomeporn.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(79, 51, '104', '1ticomeporn.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(80, 51, '105', '1ticomeporn.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(81, 52, '101', '1paphawalin.jpg', '2500.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(82, 52, '102', '1paphawalin.jpg', '2500.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(83, 52, '103', '1paphawalin.jpg', '2500.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(84, 52, '104', '1paphawalin.jpg', '2500.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(85, 52, '105', '1paphawalin.jpg', '2500.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(86, 53, '101', '1yengja.jpg', '2900.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(87, 53, '102', '1yengja.jpg', '2900.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(88, 53, '103', '1yengja.jpg', '2900.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(89, 53, '104', '1yengja.jpg', '2900.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(90, 53, '105', '1yengja.jpg', '2900.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(91, 54, '101', '1thenight.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(92, 54, '102', '1thenight.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(93, 54, '103', '1thenight.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(94, 54, '104', '1thenight.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(95, 54, '105', '1thenight.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(96, 55, '101', '1aornsalin.jpg', '3000.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(97, 55, '102', '1aornsalin.jpg', '3000.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(98, 55, '103', '1aornsalin.jpg', '3000.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(99, 55, '104', '1aornsalin.jpg', '3000.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(100, 55, '105', '1aornsalin.jpg', '3000.00', 'มี', 'ไม่มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(101, 56, '101', '1bhansuan.jpg', '2200.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(102, 56, '102', '1bhansuan.jpg', '2200.00', 'มี', 'มี', 'มี', 'มี', 'ไม่มี', 'ว่าง'),
(103, 56, '103', '1bhansuan.jpg', '2200.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(104, 56, '104', '1bhansuan.jpg', '2200.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(105, 56, '105', '1bhansuan.jpg', '2200.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(106, 57, '101', '1pornwarai.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(107, 57, '102', '1pornwarai.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(108, 57, '103', '1pornwarai.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(109, 57, '104', '1pornwarai.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(110, 57, '105', '1pornwarai.jpg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(111, 58, '101', '1chutpet.jpg', '2100.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(112, 58, '102', '1chutpet.jpg', '2100.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(113, 58, '103', '1chutpet.jpg', '2100.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(114, 58, '104', '1chutpet.jpg', '2100.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(115, 58, '105', '1chutpet.jpg', '2100.00', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'ไม่มี', 'มี', 'ว่าง'),
(116, 59, '101', '1piyadit.jpg', '3000.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(117, 59, '102', '1piyadit.jpg', '3000.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(118, 59, '103', '1piyadit.jpg', '3000.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(119, 59, '104', '1piyadit.jpg', '3000.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(120, 59, '105', '1piyadit.jpg', '3000.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(140, 67, '3', 'iconhome.jpg', '1.00', 'มี', 'มี', 'มี', 'ไม่มี', 'มี', 'ว่าง'),
(141, 68, '101', '100305_3028.jpeg', '3500.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(142, 40, '123', '1np.jpg', '2000.00', 'มี', 'มี', 'มี', 'มี', 'มี', 'ว่าง'),
(143, 69, '101', '120161990_832537063952681_6713144204012499725_n.jpg', '2500.00', 'มี', 'มี', 'มี', 'ไม่มี', 'มี', 'ว่าง');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `user_password` varchar(100) NOT NULL,
  `user_citizen` varchar(13) NOT NULL,
  `user_email` varchar(100) NOT NULL,
  `user_gender` varchar(10) NOT NULL,
  `user_tel` varchar(10) NOT NULL,
  `user_status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `oauth_role`
--
ALTER TABLE `oauth_role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `oauth_user`
--
ALTER TABLE `oauth_user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKl5alypubd40lwejc45vl35wjb` (`role`),
  ADD KEY `FKcgvlbw3uxs532jje6xsul0v8o` (`role_entity_id`);

--
-- Indexes for table `tb_convenient`
--
ALTER TABLE `tb_convenient`
  ADD PRIMARY KEY (`con_id`),
  ADD KEY `dorm_id` (`dorm_id`);

--
-- Indexes for table `tb_dorm`
--
ALTER TABLE `tb_dorm`
  ADD PRIMARY KEY (`dorm_id`),
  ADD KEY `id` (`id`),
  ADD KEY `type_id` (`type_id`);

--
-- Indexes for table `tb_dormtype`
--
ALTER TABLE `tb_dormtype`
  ADD PRIMARY KEY (`type_id`);

--
-- Indexes for table `tb_member`
--
ALTER TABLE `tb_member`
  ADD PRIMARY KEY (`mem_id`),
  ADD KEY `user_id` (`id`),
  ADD KEY `room_id` (`room_id`),
  ADD KEY `dorm_id` (`dorm_id`);

--
-- Indexes for table `tb_payment`
--
ALTER TABLE `tb_payment`
  ADD PRIMARY KEY (`pay_id`),
  ADD KEY `mem_id` (`mem_id`),
  ADD KEY `dorm_id` (`dorm_id`);

--
-- Indexes for table `tb_room`
--
ALTER TABLE `tb_room`
  ADD PRIMARY KEY (`room_id`),
  ADD KEY `dorm_id` (`dorm_id`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `oauth_role`
--
ALTER TABLE `oauth_role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `oauth_user`
--
ALTER TABLE `oauth_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;
--
-- AUTO_INCREMENT for table `tb_convenient`
--
ALTER TABLE `tb_convenient`
  MODIFY `con_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT for table `tb_dorm`
--
ALTER TABLE `tb_dorm`
  MODIFY `dorm_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
--
-- AUTO_INCREMENT for table `tb_dormtype`
--
ALTER TABLE `tb_dormtype`
  MODIFY `type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tb_member`
--
ALTER TABLE `tb_member`
  MODIFY `mem_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `tb_payment`
--
ALTER TABLE `tb_payment`
  MODIFY `pay_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_room`
--
ALTER TABLE `tb_room`
  MODIFY `room_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=144;
--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `oauth_user`
--
ALTER TABLE `oauth_user`
  ADD CONSTRAINT `FKcgvlbw3uxs532jje6xsul0v8o` FOREIGN KEY (`role_entity_id`) REFERENCES `oauth_role` (`id`),
  ADD CONSTRAINT `FKl5alypubd40lwejc45vl35wjb` FOREIGN KEY (`role`) REFERENCES `oauth_role` (`id`);

--
-- Constraints for table `tb_convenient`
--
ALTER TABLE `tb_convenient`
  ADD CONSTRAINT `FK_tb_convenient_tb_dorm` FOREIGN KEY (`dorm_id`) REFERENCES `tb_dorm` (`dorm_id`);

--
-- Constraints for table `tb_dorm`
--
ALTER TABLE `tb_dorm`
  ADD CONSTRAINT `FK_tb_dorm_oauth_user` FOREIGN KEY (`id`) REFERENCES `oauth_user` (`id`),
  ADD CONSTRAINT `FK_tb_dorm_tb_dormtype` FOREIGN KEY (`type_id`) REFERENCES `tb_dormtype` (`type_id`);

--
-- Constraints for table `tb_member`
--
ALTER TABLE `tb_member`
  ADD CONSTRAINT `FK_tb_member_tb_dorm` FOREIGN KEY (`dorm_id`) REFERENCES `tb_dorm` (`dorm_id`),
  ADD CONSTRAINT `FK_tb_member_tb_room` FOREIGN KEY (`room_id`) REFERENCES `tb_room` (`room_id`);

--
-- Constraints for table `tb_payment`
--
ALTER TABLE `tb_payment`
  ADD CONSTRAINT `FK_tb_payment_tb_dorm` FOREIGN KEY (`dorm_id`) REFERENCES `tb_dorm` (`dorm_id`),
  ADD CONSTRAINT `FK_tb_payment_tb_member` FOREIGN KEY (`mem_id`) REFERENCES `tb_member` (`mem_id`);

--
-- Constraints for table `tb_room`
--
ALTER TABLE `tb_room`
  ADD CONSTRAINT `FK_tb_room_tb_dorm` FOREIGN KEY (`dorm_id`) REFERENCES `tb_dorm` (`dorm_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
