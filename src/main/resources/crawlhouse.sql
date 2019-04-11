/*
Navicat MySQL Data Transfer

Source Server         : crawlhouse
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : crawlhouse

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-04-11 08:21:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for houseinfo
-- ----------------------------
DROP TABLE IF EXISTS `houseinfo`;
CREATE TABLE `houseinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '房源标题',
  `monthlyRent` varchar(255) DEFAULT NULL COMMENT '月租（元/月）',
  `payType` varchar(255) DEFAULT NULL COMMENT '付款方式（押一付三等）',
  `rentType` varchar(255) DEFAULT NULL COMMENT '租赁方式（整租等）',
  `roomType` varchar(255) DEFAULT NULL COMMENT '房屋类型（两室一厅等）',
  `area` varchar(255) DEFAULT NULL COMMENT '面积',
  `floor` varchar(255) DEFAULT NULL COMMENT '楼层',
  `addr` varchar(255) DEFAULT NULL COMMENT '地址',
  `decoration` varchar(255) DEFAULT NULL COMMENT '装修情况（简单装修，豪华装修等）',
  `releaseDate` varchar(255) DEFAULT NULL COMMENT '发布时间',
  `fristImg` varchar(255) DEFAULT NULL COMMENT '房源首图',
  `faceto` varchar(255) DEFAULT NULL COMMENT '朝向（东北等）',
  `source` varchar(255) DEFAULT NULL COMMENT '来源：房天下；安居客',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
