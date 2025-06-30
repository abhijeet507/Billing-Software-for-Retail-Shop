-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2018 at 04:36 PM
-- Server version: 5.5.34
-- PHP Version: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `billing`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--
create database billing;
use billing
CREATE TABLE IF NOT EXISTS `customer` (
  `customerid` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `gstinNo` varchar(30) DEFAULT NULL,
  `BusinessName` varchar(50) NOT NULL,
  `state` varchar(50) DEFAULT NULL,
  `Remark` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerid`, `Name`, `address`, `contact`, `gstinNo`, `BusinessName`, `state`, `Remark`) VALUES
(1, 'abc', 'indrapuri', '8602768216', '1001', 'abc', 'mp', 'abc'),
(2, 'deepak', 'city', '9900990012', '121', 'shop', 'mp', 'temp');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `itemid` int(11) NOT NULL AUTO_INCREMENT,
  `itemname` varchar(50) NOT NULL,
  `brand` varchar(70) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` float NOT NULL,
  `pieces` int(11) NOT NULL,
  `toalqty` int(11) DEFAULT NULL,
  `gst` float DEFAULT NULL,
  `profit` float NOT NULL,
  `totalcost` float NOT NULL,
  `Date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`itemid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`itemid`, `itemname`, `brand`, `quantity`, `price`, `pieces`, `toalqty`, `gst`, `profit`, `totalcost`, `Date`) VALUES
(6, 'aaa', 'xyz', 10, 5, 10, 100, 5, 10, 57.75, '2018/12/24'),
(13, 'aaa', 'xyz', 20, 10, 5, 100, 6, 11, 235.32, '2018/12/24'),
(14, 'silver coin atta', 'silver coin', 100, 100, 10, 1000, 5, 10, 11550, '2018/12/26'),
(15, 'silver coin atta', 'silver coin', 50, 100, 10, 500, 5, 15, 6037.5, '2018/12/26');

-- --------------------------------------------------------

--
-- Table structure for table `itemstock`
--

CREATE TABLE IF NOT EXISTS `itemstock` (
  `itemid` int(5) NOT NULL AUTO_INCREMENT,
  `itemname` varchar(30) NOT NULL,
  `availquantity` int(20) NOT NULL,
  `price` decimal(5,2) NOT NULL,
  `gst` decimal(5,2) NOT NULL,
  `sellerprofit` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`itemid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `itemstock`
--

INSERT INTO `itemstock` (`itemid`, `itemname`, `availquantity`, `price`, `gst`, `sellerprofit`) VALUES
(1, 'aaa', 0, '10.00', '6.00', '11.00'),
(2, 'silver coin atta', 146, '100.00', '5.00', '15.00');

-- --------------------------------------------------------

--
-- Table structure for table `sellitem`
--

CREATE TABLE IF NOT EXISTS `sellitem` (
  `invoice` int(5) NOT NULL AUTO_INCREMENT,
  `cname` varchar(30) NOT NULL,
  `date` varchar(30) NOT NULL,
  `itemname` varchar(30) NOT NULL,
  `price` varchar(50) DEFAULT NULL,
  `quantity` int(5) NOT NULL,
  `tax` varchar(50) DEFAULT NULL,
  `bill` varchar(50) DEFAULT NULL,
  `discount` varchar(50) DEFAULT NULL,
  `disbill` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`invoice`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `sellitem`
--

INSERT INTO `sellitem` (`invoice`, `cname`, `date`, `itemname`, `price`, `quantity`, `tax`, `bill`, `discount`, `disbill`) VALUES
(1, 'abc', '2018/12/25', 'aaa', '10.00000000', 2, '6.00000000', '21.32999992', '5.00000000', '20.27000046'),
(2, 'abc', '2018/12/25', 'aaa', '10.00000000', 3, '6.00000000', '32.00000000', '50.00000000', '16.00000000'),
(3, 'abc', '2018/12/26', 'aaa', '10.00000000', 5, '6.00000000', '58.83000183', '5.00000000', '55.88850021'),
(4, 'abc', '2018/12/26', 'aaa', '10.00000000', 5, '6.00000000', '58.83000183', '5.00000000', '55.88850021'),
(5, 'abc', '2018/12/26', 'aaa', '10.00', 5, '6.00000000', '58.83000183', '5.00000000', '55.88850021'),
(6, 'deepak', '2018/12/26', 'aaa', '10.00', 5, '6.00000000', '58.83000183', '5.00000000', '55.88850021'),
(7, 'deepak', '2018/12/26', 'aaa', '10.00', 5, '6.00000000', '58.83000183', '5.00000000', '55.00000000'),
(8, 'pankaj', '2018/12/26', 'silver coin atta', '100.00', 2, '5.00', '241.5', '5', '229.425'),
(9, 'pankaj', '2018/12/26', 'silver coin atta', '100.00', 2, '5.00', '241.5', '6', '227.01');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
