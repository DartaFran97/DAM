CREATE TABLE `Agenda` (
  `id_agendaAgenda` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuarioAgenda` int(11) NOT NULL,
  `id_tarea` int(11) NOT NULL,
  PRIMARY KEY (`id_agendaAgenda`,`id_tarea`,`id_usuarioAgenda`),
  KEY `id_usuario_idx` (`id_usuarioAgenda`),
  KEY `id _tareaAgenda_idx` (`id_tarea`),
  CONSTRAINT `id _tareaAgenda` FOREIGN KEY (`id_tarea`) REFERENCES `tarea` (`id _tarea`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_usuarioAgenda` FOREIGN KEY (`id_usuarioAgenda`) REFERENCES `usuarios` (`id_usuarios`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `notas` (
  `id notas` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuarioNotas` int(11) NOT NULL,
  `nombre_nota` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id notas`),
  KEY `id_usuario_idx` (`id_usuarioNotas`),
  KEY `id_usuarioNotas_idx` (`id_usuarioNotas`),
  CONSTRAINT `id_usuarioNotas` FOREIGN KEY (`id_usuarioNotas`) REFERENCES `usuarios` (`id_usuarios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `tarea` (
  `id _tarea` int(11) NOT NULL AUTO_INCREMENT,
  `id_agendaTarea` int(11) NOT NULL,
  `id_usuarioTarea` int(11) NOT NULL,
  `fecha_tarea` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `check` int(11) DEFAULT NULL,
  `asistentes` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id _tarea`),
  KEY `id_usuarioTarea_idx` (`id_usuarioTarea`),
  KEY `id_agendaTareas_idx` (`id_agendaTarea`),
  CONSTRAINT `id_agendaTareas` FOREIGN KEY (`id_agendaTarea`) REFERENCES `Agenda` (`id_agendaAgenda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_usuarioTarea` FOREIGN KEY (`id_usuarioTarea`) REFERENCES `usuarios` (`id_usuarios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `usuarios` (
  `id_usuarios` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `nickname` varchar(45) NOT NULL,
  `passsword` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `rol` varchar(45) NOT NULL,
  PRIMARY KEY (`id_usuarios`),
  UNIQUE KEY `nickname_UNIQUE` (`nickname`),
  UNIQUE KEY `id_usuarios_UNIQUE` (`id_usuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
