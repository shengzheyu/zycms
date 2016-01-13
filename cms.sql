/*
MySQL Data Transfer
Source Host: localhost
Source Database: cms
Target Host: localhost
Target Database: cms
Date: 2016/1/12 22:57:12
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for t_article
-- ----------------------------
CREATE TABLE `t_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `source` varchar(200) DEFAULT NULL,
  `author` varchar(200) DEFAULT NULL,
  `content` longtext,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `publish_time` datetime DEFAULT NULL,
  `channel_id` varchar(40) DEFAULT NULL,
  `is_header_line` char(1) DEFAULT NULL,
  `is_recommend` char(1) DEFAULT NULL,
  `click_score` int(11) DEFAULT NULL,
  `msg_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_channel
-- ----------------------------
CREATE TABLE `t_channel` (
  `id` varchar(40) NOT NULL,
  `channelname` varchar(40) DEFAULT NULL,
  `description` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_massage
-- ----------------------------
CREATE TABLE `t_massage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `publisher` varchar(40) DEFAULT NULL,
  `content` longtext,
  `article_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `t_article` VALUES ('1', '1', '1', '1', '11111', '2016-01-12 22:48:27', '2016-01-12 22:48:51', '2016-01-12 22:48:45', '1', '0', '0', '1', '0');
INSERT INTO `t_channel` VALUES ('1', 'test', 'test');
INSERT INTO `t_user` VALUES ('1', '123', '123');
