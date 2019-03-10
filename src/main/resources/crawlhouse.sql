/*
Navicat MySQL Data Transfer

Source Server         : crawlhouse
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : crawlhouse

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-03-10 22:24:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for houseinfo
-- ----------------------------
DROP TABLE IF EXISTS `houseinfo`;
CREATE TABLE `houseinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `houseType` int(1) DEFAULT NULL COMMENT '户型：1=一居室；2=二居室；3=三居室；4=四居室以上',
  `direction` varchar(0) DEFAULT NULL COMMENT '朝向',
  `area` double DEFAULT NULL COMMENT '房屋面积（单位：平方米）',
  `monthlyRent` double DEFAULT NULL COMMENT '月租（单位：元）',
  `sellType` int(1) DEFAULT NULL COMMENT '房屋买卖类型：1=新房；2=二手房；3=出租房',
  `releaseDate` datetime DEFAULT NULL COMMENT '发布日期',
  `floor` int(2) DEFAULT NULL COMMENT '楼层',
  `addr` varchar(255) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of houseinfo
-- ----------------------------

-- ----------------------------
-- Table structure for imghouse
-- ----------------------------
DROP TABLE IF EXISTS `imghouse`;
CREATE TABLE `imghouse` (
  `id` int(11) NOT NULL,
  `imgPath` varchar(255) DEFAULT NULL COMMENT '图片路径',
  `houseid` int(11) DEFAULT NULL COMMENT '房屋信息id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of imghouse
-- ----------------------------
