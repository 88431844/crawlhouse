/*
Navicat MySQL Data Transfer

Source Server         : crawlhouse
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : crawlhouse

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-03-27 22:37:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for houseequip
-- ----------------------------
DROP TABLE IF EXISTS `houseequip`;
CREATE TABLE `houseequip` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `equipName` varchar(255) DEFAULT NULL COMMENT '配套名称（电视，空调等）',
  `houseId` int(11) DEFAULT NULL,
  `houseType` int(1) unsigned zerofill DEFAULT '0' COMMENT '0=租房；1=二手房；2=新房；',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for imghouse
-- ----------------------------
DROP TABLE IF EXISTS `imghouse`;
CREATE TABLE `imghouse` (
  `id` int(11) NOT NULL,
  `imgPath` varchar(255) DEFAULT NULL COMMENT '图片路径',
  `houseId` int(11) DEFAULT NULL COMMENT '房屋信息id',
  `houseType` int(1) unsigned zerofill DEFAULT '0' COMMENT '0=租房；1=二手房；2=新房；',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for renthouse
-- ----------------------------
DROP TABLE IF EXISTS `renthouse`;
CREATE TABLE `renthouse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '房源标题',
  `monthlyRent` int(11) DEFAULT NULL COMMENT '月租（单位：元）',
  `payType` varchar(255) DEFAULT NULL COMMENT '付款方式（押一付三）',
  `rentType` varchar(255) DEFAULT NULL COMMENT '租赁方式（整租等）',
  `roomType` varchar(255) DEFAULT NULL COMMENT '房屋类型（两室一厅等）',
  `area` int(11) DEFAULT NULL COMMENT '房屋面积（单位：平方米）',
  `floor` int(2) DEFAULT NULL COMMENT '楼层',
  `addr` varchar(255) DEFAULT NULL COMMENT '地址',
  `decoration` varchar(255) DEFAULT NULL COMMENT '装修情况（简单装修，豪华装修等）',
  `releaseDate` varchar(255) DEFAULT NULL COMMENT '发布日期',
  `fristImg` varchar(255) DEFAULT NULL COMMENT '第一张房源图片地址',
  `faceto` varchar(255) DEFAULT NULL COMMENT '朝向',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;
