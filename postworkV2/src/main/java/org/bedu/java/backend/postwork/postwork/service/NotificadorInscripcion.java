package org.bedu.java.backend.postwork.postwork.service;

import org.bedu.java.backend.postwork.postwork.model.SolicitudEstudiante;

public interface NotificadorInscripcion {
    void notificarMaestro(SolicitudEstudiante solicitud);
}
