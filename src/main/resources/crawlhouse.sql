/*
 Navicat Premium Data Transfer

 Source Server         : crawlhouse
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : crawlhouse

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 08/03/2019 14:58:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for houseinfo
-- ----------------------------
DROP TABLE IF EXISTS `houseinfo`;
CREATE TABLE `houseinfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `houseType` int(1) NULL DEFAULT NULL COMMENT '户型：1=一居室；2=二居室；3=三居室；4=四居室以上',
  `direction` varchar(0) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '朝向',
  `area` double NULL DEFAULT NULL COMMENT '房屋面积（单位：平方米）',
  `monthlyRent` double NULL DEFAULT NULL COMMENT '月租（单位：元）',
  `sellType` int(1) NULL DEFAULT NULL COMMENT '房屋买卖类型：1=新房；2=二手房；3=出租房',
  `releaseDate` datetime(0) NULL DEFAULT NULL COMMENT '发布日期',
  `floor` int(2) NULL DEFAULT NULL COMMENT '楼层',
  `addr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for imghouse
-- ----------------------------
DROP TABLE IF EXISTS `imghouse`;
CREATE TABLE `imghouse`  (
  `id` int(11) NOT NULL,
  `imgPath` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片路径',
  `houseid` int(11) NULL DEFAULT NULL COMMENT '房屋信息id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
