CREATE TABLE `user` (
  `UserID` int(11) NOT NULL,
  `Score` bigint(20) NOT NULL DEFAULT '0' COMMENT '积分',
  `Diamond` bigint(20) NOT NULL DEFAULT '0' COMMENT '钻石',
  `Experience` bigint(20) NOT NULL DEFAULT '0' COMMENT '经验',
  `InfullAmount` float(11,4) NOT NULL DEFAULT '0.0000' COMMENT '总充值',
  `VIP` int(11) NOT NULL DEFAULT '0' COMMENT 'VIP',
  `PlayScore` bigint(20) NOT NULL DEFAULT '0' COMMENT '总玩分',
  `WinScore` bigint(20) NOT NULL DEFAULT '0' COMMENT '总赢分',
  `PlayTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '总玩时长',
  `LockCannon` int(11) NOT NULL DEFAULT '1' COMMENT '解锁炮倍',
  `GunStyle` int(11) NOT NULL DEFAULT '0' COMMENT '使用的炮皮肤',
  `FaceStyle` int(11) NOT NULL DEFAULT '0' COMMENT '头像框',
  `VipIntegral` int(11) NOT NULL DEFAULT '0' COMMENT 'VIP积分',
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;