/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-02-15 23:26:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `country` varchar(20) CHARACTER SET utf8 NOT NULL,
  `province` varchar(20) CHARACTER SET utf8 NOT NULL,
  `city` varchar(20) CHARACTER SET utf8 NOT NULL,
  `street` varchar(50) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('1', '中国', '山东', '淄博', '青岛路106号');
INSERT INTO `address` VALUES ('2', '中国', '陕西', '西安', '上海路16号');
INSERT INTO `address` VALUES ('3', '中国', '北京', '北京', '海淀区苏州街17号');
INSERT INTO `address` VALUES ('4', '中国', '山东', '青岛', '北京路12号');
INSERT INTO `address` VALUES ('5', '中国', '山东', '济南', '海南路10号');
