/*
Navicat MySQL Data Transfer

Source Server         : mariadb
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : job

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-09-14 08:56:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for police
-- ----------------------------
DROP TABLE IF EXISTS `police`;
CREATE TABLE `police` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) DEFAULT NULL,
  `dbName` varchar(100) DEFAULT database(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of police
-- ----------------------------
INSERT INTO `police` VALUES ('1', '张三', 'job');
INSERT INTO `police` VALUES ('2', '李四', 'job');
INSERT INTO `police` VALUES ('3', '黄思朗', 'job');
INSERT INTO `police` VALUES ('4', '李江', 'job');
INSERT INTO `police` VALUES ('5', '张麻子', 'job');
INSERT INTO `police` VALUES ('6', '小泽玛利亚', 'job');
INSERT INTO `police` VALUES ('7', '天海翼', 'job');
