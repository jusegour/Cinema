-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2019 a las 00:29:44
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `tipo_cliente` varchar(45) NOT NULL,
  `nro_identificacion` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `idhorario` int(11) NOT NULL,
  `teatro` int(11) NOT NULL,
  `sala` int(11) NOT NULL,
  `pelicula` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `hora` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `idpelicula` int(11) NOT NULL,
  `director` varchar(45) NOT NULL,
  `duracion` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `idioma` varchar(45) NOT NULL,
  `resumen` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `idreservas` int(11) NOT NULL,
  `tipo_cliente` varchar(45) NOT NULL,
  `ID_cliente` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `multiplex` varchar(45) NOT NULL,
  `pelicula` varchar(45) NOT NULL,
  `hora` varchar(45) NOT NULL,
  `ubicacion` varchar(45) NOT NULL,
  `metodo_pago` varchar(45) NOT NULL,
  `sillas_reservadas` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE `sala` (
  `idsala` int(11) NOT NULL,
  `capacidad` varchar(45) NOT NULL,
  `nro_localidades` varchar(45) NOT NULL,
  `sillas_pref` varchar(45) NOT NULL,
  `sillas_gen` varchar(45) NOT NULL,
  `sillas_cinebar` varchar(45) NOT NULL,
  `sillas_fumadores` varchar(45) NOT NULL,
  `horario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `taquillero`
--

CREATE TABLE `taquillero` (
  `idtaquillero` int(11) NOT NULL,
  `tipo_identificacion` varchar(45) NOT NULL,
  `nro_identificacion` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjeta`
--

CREATE TABLE `tarjeta` (
  `idtarjeta` int(11) NOT NULL,
  `saldo` float NOT NULL,
  `puntos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `teatro`
--

CREATE TABLE `teatro` (
  `idteatro` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `horario` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `extension` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`idhorario`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`idpelicula`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`idreservas`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`idsala`);

--
-- Indices de la tabla `taquillero`
--
ALTER TABLE `taquillero`
  ADD PRIMARY KEY (`idtaquillero`);

--
-- Indices de la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD PRIMARY KEY (`idtarjeta`);

--
-- Indices de la tabla `teatro`
--
ALTER TABLE `teatro`
  ADD PRIMARY KEY (`idteatro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `horario`
--
ALTER TABLE `horario`
  MODIFY `idhorario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `idpelicula` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `idreservas` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sala`
--
ALTER TABLE `sala`
  MODIFY `idsala` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `taquillero`
--
ALTER TABLE `taquillero`
  MODIFY `idtaquillero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  MODIFY `idtarjeta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `teatro`
--
ALTER TABLE `teatro`
  MODIFY `idteatro` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
