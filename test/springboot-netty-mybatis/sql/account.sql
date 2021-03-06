CREATE TABLE `account` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `Account` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '账号',
  `NickName` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '昵称',
  `Password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '密码',
  `FaceID` int(11) NOT NULL DEFAULT '0' COMMENT '头像ID',
  `FacebookID` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'FacebookID',
  `WeiXinID` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '微信号',
  `MobileNum` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '手机号',
  `FaceUrl` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '头像地址',
  `Sex` bit(1) NOT NULL DEFAULT b'0' COMMENT '性别',
  `Country` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '国籍',
  `RegisterTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `RegisterIP` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '注册IP',
  `version` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '注册版本',
  `platform` int(11) NOT NULL DEFAULT '0' COMMENT '代理平台',
  `language` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '语言',
  `channel` int(11) NOT NULL DEFAULT '0' COMMENT '渠道',
  `MobileID` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '手机ID',
  `ProtectPassword` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '保护密码',
  `IP` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'IP地址',
  `LoginTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登陆时间',
  `CurrentVersion` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '当前版本',
  `UserType` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户类型',
  `logonType` int(4) NOT NULL DEFAULT '0' COMMENT '0游客登陆 1账号登陆 2手机登陆 3facebook登陆 4微信登陆',
  `upgradeAccount` bit(1) NOT NULL COMMENT '是否已升级账号',
  PRIMARY KEY (`UserID`),
  UNIQUE KEY `index_UserDB_account_Account` (`Account`) USING BTREE,
  KEY `index_UserDB_account_FacebookID` (`FacebookID`) USING BTREE,
  KEY `index_UserDB_account_WeiXinID` (`WeiXinID`) USING BTREE,
  KEY `index_UserDB_account_MobileNum` (`MobileNum`) USING BTREE,
  KEY `index_UserDB_account_NickName` (`NickName`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1308 DEFAULT CHARSET=utf8mb4;

