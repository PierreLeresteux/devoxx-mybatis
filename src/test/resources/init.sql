CREATE TABLE IF NOT EXISTS `speaker` (
  `id`      BIGINT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `prenom`  VARCHAR(50)         NOT NULL DEFAULT '',
  `nom`     VARCHAR(50)         NOT NULL DEFAULT '',
  `mail`    VARCHAR(150)                 DEFAULT '',
  `twitter` VARCHAR(50)                  DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


CREATE TABLE IF NOT EXISTS `company` (
  `id`      BIGINT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nom`     VARCHAR(150)                 DEFAULT NULL,
  `adresse` VARCHAR(2000)                DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


CREATE TABLE IF NOT EXISTS `emplois` (
  `id`             BIGINT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_speaker`     BIGINT(11) UNSIGNED NOT NULL,
  `id_company`     BIGINT(11) UNSIGNED NOT NULL,
  `annee_embauche` DATE                         DEFAULT NULL,
  `annee_depart`   DATE                         DEFAULT NULL,
  `job` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_speaker` (`id_speaker`, `id_company`),
  KEY `id_company` (`id_company`),
  CONSTRAINT `emplois_ibfk_1` FOREIGN KEY (`id_speaker`) REFERENCES `speaker` (`id`),
  CONSTRAINT `emplois_ibfk_2` FOREIGN KEY (`id_company`) REFERENCES `company` (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `talk` (
  `id`         BIGINT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `annee`      INT(4)                       DEFAULT NULL,
  `conference` VARCHAR(100)                 DEFAULT NULL,
  `titre`      VARCHAR(200)                 DEFAULT NULL,
  `id_speaker` BIGINT(11)                   DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
