/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-02-15 23:23:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `description` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `teacherID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'MyBatis', 'MyBatis是一个支持普通SQL查询,存储过程和高级映射的优秀持久层框架。', '1');
INSERT INTO `course` VALUES ('2', 'Java SE', 'Java se是由Sun Microsystems公司推出的Java程序设计语言。', '2');
INSERT INTO `course` VALUES ('3', 'Maven', 'Maven是来管理项目的构建，报告和文档的软件项目', '1');
INSERT INTO `course` VALUES ('4', 'Spring', 'Spring是于2003 年兴起的一个轻量级的Java 开发框架。', '2');
INSERT INTO `course` VALUES ('5', 'Git', 'Git是一款免费、开源的分布式版本控制系统。', '1');
