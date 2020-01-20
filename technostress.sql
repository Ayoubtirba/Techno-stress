-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3307
-- Généré le :  lun. 20 jan. 2020 à 12:16
-- Version du serveur :  10.3.14-MariaDB
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `technostress`
--

-- --------------------------------------------------------

--
-- Structure de la table `clef`
--

DROP TABLE IF EXISTS `clef`;
CREATE TABLE IF NOT EXISTS `clef` (
  `id_clef` int(11) NOT NULL AUTO_INCREMENT,
  `id_psy` int(11) NOT NULL,
  `id_file` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id_clef`),
  KEY `id_psy` (`id_psy`),
  KEY `id_file` (`id_file`),
  KEY `id_user` (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=72 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `clef`
--

INSERT INTO `clef` (`id_clef`, `id_psy`, `id_file`, `id_user`, `status`) VALUES
(55, 25, 255, 42, 0),
(54, 12, 255, 42, 1),
(56, 25, 246, 12, 0),
(57, 25, 255, 30, 0),
(52, 12, 192, 33, 1),
(51, 12, 186, 33, 1),
(50, 12, 181, 32, 1),
(49, 12, 185, 32, 1),
(48, 12, 184, 30, 1),
(47, 12, 185, 30, 1),
(53, 12, 246, 40, 1),
(58, 25, 255, 33, 0),
(59, 12, 262, 45, 1),
(60, 30, 255, 46, 1),
(61, 30, 256, 46, 1),
(62, 30, 260, 45, 0),
(63, 12, 284, 33, 1),
(64, 12, 284, 32, 0),
(65, 12, 278, 50, 1),
(66, 12, 289, 50, 1),
(67, 12, 278, 32, 1),
(68, 12, 285, 51, 1),
(69, 12, 296, 51, 0),
(70, 12, 296, 51, 0),
(71, 12, 295, 52, 1);

-- --------------------------------------------------------

--
-- Structure de la table `file`
--

DROP TABLE IF EXISTS `file`;
CREATE TABLE IF NOT EXISTS `file` (
  `id_file` int(11) NOT NULL AUTO_INCREMENT,
  `nom_file` text NOT NULL,
  `q2` text NOT NULL,
  `q3` text NOT NULL,
  `q4` text NOT NULL,
  `q5` text NOT NULL,
  `q6` text NOT NULL,
  `q7` text NOT NULL,
  PRIMARY KEY (`id_file`)
) ENGINE=MyISAM AUTO_INCREMENT=299 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `file`
--

INSERT INTO `file` (`id_file`, `nom_file`, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`) VALUES
(295, 'Oreal', 'Canavaro', 'o.carna', 'shd7689', '11', 'shd7689', 'shd7689'),
(296, 'Care', 'Ramos', 'rami', 's45532jdkld', '9', 's45532jdkld', 's45532jdkld'),
(297, 'Umdre', 'Calio', 'calio23', '28snksms46sjdkld', '26', '28snksms46sjdkld', '28snksms46sjdkld'),
(298, 'teachersdunet', 'Puto', 'denote', 'ppos46sjdkld', '18', 'ppos46sjdkld', 'ppos46sjdkld'),
(292, 'Honore', 'Hounwanou', 'mercuryseries', 'xfs546sjdkld', '135', 'xfs546sjdkld', 'xfs546sjdkld'),
(293, 'Heilki', 'Pedro', 'pedroh', 'jsj36373', '14', 'jsj36373', 'jsj36373'),
(294, 'Hoore', 'Sanchez', 'sanitos', 'Dl$jaqeekld', '32', 'Dl$jaqeekld', 'Dl$jaqeekld'),
(291, 'teachersdunet', 'Puto', 'denote', 'ppos46sjdkld', '18', 'ppos46sjdkld', 'ppos46sjdkld'),
(290, 'Umdre', 'Calio', 'calio23', '28snksms46sjdkld', '26', '28snksms46sjdkld', '28snksms46sjdkld'),
(289, 'Care', 'Ramos', 'rami', 's45532jdkld', '9', 's45532jdkld', 's45532jdkld'),
(287, 'Hoore', 'Sanchez', 'sanitos', 'Dl$jaqeekld', '32', 'Dl$jaqeekld', 'Dl$jaqeekld'),
(288, 'Oreal', 'Canavaro', 'o.carna', 'shd7689', '11', 'shd7689', 'shd7689'),
(285, 'Honore', 'Hounwanou', 'mercuryseries', 'xfs546sjdkld', '135', 'xfs546sjdkld', 'xfs546sjdkld'),
(286, 'Heilki', 'Pedro', 'pedroh', 'jsj36373', '14', 'jsj36373', 'jsj36373'),
(278, 'Honore', 'Hounwanou', 'mercuryseries', 'xfs546sjdkld', '135', 'xfs546sjdkld', 'xfs546sjdkld');

-- --------------------------------------------------------

--
-- Structure de la table `psy`
--

DROP TABLE IF EXISTS `psy`;
CREATE TABLE IF NOT EXISTS `psy` (
  `id_psy` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(26) NOT NULL,
  `Prenom` varchar(26) NOT NULL,
  `Email` varchar(26) NOT NULL,
  `MotPasse` varchar(26) NOT NULL,
  PRIMARY KEY (`id_psy`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `psy`
--

INSERT INTO `psy` (`id_psy`, `Nom`, `Prenom`, `Email`, `MotPasse`) VALUES
(12, 'cc', 'jh', 'soufiane@nitro.com', 'salmanoki'),
(25, 'moha', 'cc', 'mohmade@gamil.com', 'salmanoki'),
(30, 'hajar', 'merrouni', 'hajar@gmail.com', 'test'),
(31, 'kheifh', 'jhdfejfh', 'qyoub@gmail.com', 'cc');

-- --------------------------------------------------------

--
-- Structure de la table `recomendation`
--

DROP TABLE IF EXISTS `recomendation`;
CREATE TABLE IF NOT EXISTS `recomendation` (
  `id_reco` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `id_psy` int(11) NOT NULL,
  `recomondation` text NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id_reco`)
) ENGINE=MyISAM AUTO_INCREMENT=59 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `recomendation`
--

INSERT INTO `recomendation` (`id_reco`, `id_user`, `id_psy`, `recomondation`, `status`) VALUES
(52, 46, 30, '\r\nbieb bakalalalallalalalalla ', 0),
(51, 45, 12, 'mooh\r\n', 0),
(50, 42, 12, '\r\nccugduwgd', 0),
(44, 33, 12, 'khaaaasskk tkol mzn', 0),
(47, 33, 12, 'mimi\r\n', 1),
(48, 33, 12, '\r\n', 1),
(49, 40, 12, 'mouvais', 0),
(46, 33, 12, 'mimi\r\n', 1),
(45, 33, 12, 'mimi\r\n', 0),
(43, 32, 12, '\r\ngg', 0),
(41, 30, 12, 'hoho\r\n', 0),
(42, 32, 12, '\r\nbine', 0),
(40, 30, 12, '\r\nmomo', 0),
(39, 32, 12, 'mouvais\r\n', 0),
(53, 33, 12, '\r\nmomo', 0),
(54, 50, 12, '\r\nmomo', 0),
(55, 50, 12, 'momomo', 0),
(56, 32, 12, '\r\njjjjjklhjdfgeudfbguef', 0),
(57, 51, 12, 'maaalll\r\n', 0),
(58, 52, 12, '\r\njdhdjhwjkdfwheif', 0);

-- --------------------------------------------------------

--
-- Structure de la table `reponse`
--

DROP TABLE IF EXISTS `reponse`;
CREATE TABLE IF NOT EXISTS `reponse` (
  `id_reponse` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `date` datetime NOT NULL,
  `reponse1` enum('True','False') NOT NULL,
  `reponse2` enum('True','False') NOT NULL,
  `reponse3` enum('True','False') NOT NULL,
  `reponse4` enum('True','False') NOT NULL,
  `reponse5` enum('True','False') NOT NULL,
  `reponse6` enum('True','False') NOT NULL,
  `nom_fichier` varchar(26) NOT NULL,
  `id_file` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id_reponse`)
) ENGINE=MyISAM AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reponse`
--

INSERT INTO `reponse` (`id_reponse`, `id_user`, `date`, `reponse1`, `reponse2`, `reponse3`, `reponse4`, `reponse5`, `reponse6`, `nom_fichier`, `id_file`, `status`) VALUES
(46, 30, '2020-01-11 11:39:07', 'True', 'True', 'True', 'True', 'True', 'True', 'teachersdunet', 185, 1),
(45, 30, '2020-01-11 11:39:00', 'True', 'True', 'True', 'True', 'True', 'True', 'Umdre', 184, 1),
(47, 32, '2020-01-11 11:43:21', 'False', 'False', 'False', 'False', 'False', 'False', 'Hoore', 181, 1),
(48, 32, '2020-01-11 11:43:28', 'True', 'True', 'True', 'True', 'True', 'True', 'teachersdunet', 185, 1),
(49, 33, '2020-01-11 11:49:55', 'False', 'False', 'False', 'False', 'False', 'False', 'saida', 186, 1),
(50, 33, '2020-01-11 11:57:41', 'False', 'False', 'False', 'False', 'False', 'False', 'Umdre', 192, 1),
(51, 40, '2020-01-12 16:34:26', 'False', 'False', 'False', 'False', 'False', 'False', 'Umdre', 246, 1),
(52, 42, '2020-01-12 20:42:47', 'False', 'False', 'False', 'False', 'False', 'False', 'hoho', 255, 1),
(53, 45, '2020-01-13 13:14:36', 'False', 'False', 'False', 'False', 'False', 'False', 'teachersdunet', 262, 1),
(54, 46, '2020-01-14 16:35:04', 'False', 'False', 'False', 'False', 'False', 'False', 'Honore', 256, 1),
(55, 33, '2020-01-16 19:34:00', 'False', 'False', 'False', 'False', 'False', 'False', 'teachersdunet', 284, 1),
(56, 50, '2020-01-17 03:09:58', 'False', 'False', 'False', 'False', 'False', 'False', 'Honore', 278, 1),
(57, 50, '2020-01-17 08:14:08', 'False', 'False', 'True', 'True', 'False', 'True', 'Care', 289, 1),
(58, 32, '2020-01-17 13:13:51', 'True', 'True', 'True', 'True', 'True', 'True', 'Honore', 278, 1),
(59, 51, '2020-01-17 16:12:57', 'True', 'True', 'True', 'False', 'False', 'False', 'Honore', 285, 1),
(60, 52, '2020-01-17 16:20:10', 'False', 'False', 'False', 'False', 'True', 'True', 'Oreal', 295, 1);

-- --------------------------------------------------------

--
-- Structure de la table `rh`
--

DROP TABLE IF EXISTS `rh`;
CREATE TABLE IF NOT EXISTS `rh` (
  `id_rh` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(26) NOT NULL,
  `Prenom` varchar(26) NOT NULL,
  `Email` varchar(26) NOT NULL,
  `MotPasse` varchar(26) NOT NULL,
  PRIMARY KEY (`id_rh`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `rh`
--

INSERT INTO `rh` (`id_rh`, `Nom`, `Prenom`, `Email`, `MotPasse`) VALUES
(1, 'ayoub', 'triba', 'ayoub@gmail.com', 'salmanoki');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(26) NOT NULL,
  `Prenom` varchar(26) NOT NULL,
  `Email` varchar(26) NOT NULL,
  `MotPasse` varchar(26) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id_user`, `Nom`, `Prenom`, `Email`, `MotPasse`) VALUES
(51, 'jkhfjhf', 'khdjd', 'porf@gmail.com', 'salmanoki'),
(52, 'cc', 'cc', 'fatima@gmail.com', 'salmanoki'),
(32, 'mkwaya', 'ss', 'mkwaya@gmail.com', 'salmanoki'),
(50, 'huhu', 'amin', 'huhu@gamil.com', 'salmanoki');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
