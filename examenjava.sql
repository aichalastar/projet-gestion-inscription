-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 10 juin 2024 à 20:43
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `examenjava`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE `classe` (
  `id_classe` int(11) NOT NULL,
  `niveau` varchar(50) NOT NULL,
  `filiere` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`id_classe`, `niveau`, `filiere`) VALUES
(1, 'L3', 'IAGE'),
(2, 'L3', 'TTL'),
(3, 'L2', 'GLRS'),
(4, 'L3', 'TTL'),
(5, 'L2', 'MAIE'),
(6, 'L3', 'CPD'),
(7, 'L1', 'TTL');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `id` int(11) NOT NULL,
  `nomComplet` varchar(255) NOT NULL,
  `matricule` varchar(255) NOT NULL,
  `tuteur` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `nomComplet`, `matricule`, `tuteur`) VALUES
(1, 'AICHA BOP', '8765', 'BUSHRA'),
(2, 'AICHA BOP', '7654', 'BUSHRA'),
(3, 'LEYLA', '765', 'PATHE'),
(4, 'LEYLA DIOP', '54', 'PATHE DIOP'),
(5, 'YASSINE DIALLO', '09', 'RAMA DIALLO'),
(6, 'FATOU NDIAYE', '54', 'KINE SOW'),
(7, 'AWA LY', '76', 'SDA FALL'),
(8, 'OULEY NDIAYE', '100', 'MODOU LO'),
(9, 'SOULEY LO', '12', 'MBAYE'),
(10, 'LEYLA DIOP', '26543', 'KINE LAM'),
(11, 'SALI NDOUR', '65', 'ABDOU NDOUR'),
(12, 'SIRA DIOP', '3221', 'RAMA DIOP'),
(13, 'ZAHRA BOP', '7654', 'AICHA BOP');

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

CREATE TABLE `inscription` (
  `id` int(50) NOT NULL,
  `anneeScolaire` varchar(50) NOT NULL,
  `Etudiant` varchar(255) NOT NULL,
  `Classe` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

CREATE TABLE `professeur` (
  `id_professeur` int(11) NOT NULL,
  `NCI` varchar(255) NOT NULL,
  `nomComplet` varchar(255) NOT NULL,
  `grade` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `professeur_classe`
--

CREATE TABLE `professeur_classe` (
  `id_classe` int(11) NOT NULL,
  `id_professeur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`id_classe`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Etudiant` (`Etudiant`);

--
-- Index pour la table `professeur`
--
ALTER TABLE `professeur`
  ADD PRIMARY KEY (`id_professeur`);

--
-- Index pour la table `professeur_classe`
--
ALTER TABLE `professeur_classe`
  ADD PRIMARY KEY (`id_classe`,`id_professeur`),
  ADD KEY `id_professeur` (`id_professeur`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `classe`
--
ALTER TABLE `classe`
  MODIFY `id_classe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT pour la table `inscription`
--
ALTER TABLE `inscription`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `professeur`
--
ALTER TABLE `professeur`
  MODIFY `id_professeur` int(11) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `professeur_classe`
--
ALTER TABLE `professeur_classe`
  ADD CONSTRAINT `professeur_classe_ibfk_1` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id_classe`),
  ADD CONSTRAINT `professeur_classe_ibfk_2` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id_professeur`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
