package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import br.com.alura.forum.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(private val repository: UsuarioRepository) {

    fun burcarPorId(id: Long): Usuario {
        return repository.getById(id)
    }
}
