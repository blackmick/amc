-- phpMyAdmin SQL Dump
-- version 3.4.10
-- http://www.phpmyadmin.net
--
-- Host: 10.36.5.45:6116
-- Generation Time: Jul 20, 2015 at 11:55 AM
-- Server version: 5.1.45
-- PHP Version: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ac`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_channel_meta`
--

DROP TABLE IF EXISTS `tbl_channel_meta`;
CREATE TABLE IF NOT EXISTS `tbl_channel_meta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `c_create_by` varchar(255) NOT NULL COMMENT '记录创建者',
  `c_create_time` datetime NOT NULL COMMENT '记录创建时间',
  `c_update_by` varchar(255) NOT NULL COMMENT '记录更新者',
  `c_update_time` datetime NOT NULL COMMENT '记录更新时间',
  `c_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '记录删除标记',
  `c_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '记录状态',
  `c_channel_name` varchar(255) NOT NULL DEFAULT '',
  `c_extra_0` varchar(1024) NOT NULL DEFAULT '' COMMENT '附加字段0',
  `c_extra_1` varchar(1024) NOT NULL DEFAULT '' COMMENT '附加字段1',
  `c_extra_2` varchar(1024) NOT NULL DEFAULT '' COMMENT '附加字段2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登陆渠道基本信息表';

-- --------------------------------------------------------

--
-- Table structure for table `tbl_channel_user`
--

DROP TABLE IF EXISTS `tbl_channel_user`;
CREATE TABLE IF NOT EXISTS `tbl_channel_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `c_update_by` varchar(255) NOT NULL DEFAULT '' COMMENT '记录更新者',
  `c_update_time` datetime NOT NULL COMMENT '记录更新时间',
  `c_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '记录删除标记',
  `c_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '记录状态',
  `c_channel_id` bigint(20) NOT NULL,
  `c_channel_user_id` bigint(20) NOT NULL,
  `c_prcid` varchar(32) NOT NULL DEFAULT '',
  `c_cash_card` varchar(32) NOT NULL DEFAULT '',
  `c_phone_number` varchar(32) NOT NULL DEFAULT '' COMMENT '用户手机号',
  `c_photo` varchar(512) NOT NULL DEFAULT '' COMMENT '照片url',
  `c_id_photo` varchar(512) NOT NULL DEFAULT '' COMMENT '身份证照片url',
  `c_cloud_id` varchar(64) NOT NULL DEFAULT '' COMMENT '云推送id',
  `c_reg_position` varchar(32) NOT NULL DEFAULT '' COMMENT '注册地点',
  `c_salt` varchar(32) NOT NULL DEFAULT '' COMMENT '加密salt',
  `c_password` varchar(64) NOT NULL DEFAULT '' COMMENT '加密后的密码',
  `c_create_by` varchar(255) NOT NULL DEFAULT '' COMMENT '记录创建者',
  `c_create_time` datetime NOT NULL COMMENT '记录创建时间',
  `c_extra_0` varchar(1024) NOT NULL DEFAULT '' COMMENT '附加字段0',
  `c_extra_1` varchar(1024) NOT NULL DEFAULT '' COMMENT '附加字段1',
  `c_extra_2` varchar(1024) NOT NULL DEFAULT '' COMMENT '附加字段2',
  PRIMARY KEY (`id`),
  KEY `c_channel_id` (`c_channel_id`,`c_channel_user_id`),
  KEY `c_prcid` (`c_prcid`,`c_cash_card`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE IF NOT EXISTS `tbl_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '系统内部用户id,表主键',
  `c_create_by` varchar(255) NOT NULL DEFAULT '' COMMENT '记录创建者',
  `c_create_time` datetime NOT NULL COMMENT '记录的创建时间',
  `c_update_by` varchar(255) NOT NULL,
  `c_update_time` datetime NOT NULL,
  `c_delete` tinyint(4) NOT NULL,
  `c_status` tinyint(4) NOT NULL,
  `c_prcid` varchar(32) NOT NULL,
  `c_name` varchar(16) NOT NULL,
  `c_cash_card` varchar(32) NOT NULL,
  `c_extra_0` varchar(1024) NOT NULL,
  `c_extra_1` varchar(1024) NOT NULL,
  `c_extra_2` varchar(1024) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user_channel_mapping`
--

DROP TABLE IF EXISTS `tbl_user_channel_mapping`;
CREATE TABLE IF NOT EXISTS `tbl_user_channel_mapping` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `c_create_by` varchar(255) NOT NULL DEFAULT '',
  `c_create_time` datetime NOT NULL COMMENT '记录创建时间',
  `c_update_by` varchar(255) NOT NULL DEFAULT '' COMMENT '记录更新者',
  `c_update_time` datetime NOT NULL COMMENT '记录更新时间',
  `c_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '记录删除标记',
  `c_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '记录状态',
  `c_user_id` bigint(20) NOT NULL COMMENT '用户表id',
  `c_channel_mapping_id` bigint(20) NOT NULL COMMENT '登陆渠道表id',
  `c_extra_0` varchar(1024) NOT NULL,
  `c_extra_1` varchar(1024) NOT NULL,
  `c_extra_2` varchar(1024) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户和注册渠道映射表';

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
