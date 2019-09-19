package com.demoyageek.crud_springboot.Controllers;

import com.demoyageek.crud_springboot.Entities.Estudiante;
import com.demoyageek.crud_springboot.Repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {

    /*
    @Autowired
    EstudianteRepository estudianteRepository;
    */

    EstudianteRepository estudianteRepository;
    public EstudianteController(EstudianteRepository estudianteRepository){
        this.estudianteRepository = estudianteRepository;
    }

    @RequestMapping("/")
    public String index(Model model){
        List<Estudiante> listadoEstudiantes = estudianteRepository.findAll();
        model.addAttribute("listaEstudiantes", listadoEstudiantes);
        return "index";
    }

    @RequestMapping(value = "/eliminarEstudiante/{matricula}", method = RequestMethod.POST)
    public String eliminarEstudiante(@PathVariable int matricula){
        estudianteRepository.delete(estudianteRepository.findByMatricula(matricula));
        return "redirect:/estudiante/";
    }

    @RequestMapping("/editarEstudiante/{matricula}")
    public String editarEstudiante(@PathVariable int matricula, Model model){
        Estudiante estudiante = estudianteRepository.findByMatricula(matricula);
        model.addAttribute("estudiante", estudiante);
        return "editarEstudiante";
    }

    @RequestMapping("/crearEstudiante")
    public String crearEstudiante(){
        return "crearEstudiante";
    }

    @RequestMapping(value = "/guardarEstudiante", method = {RequestMethod.POST})
    public String guardarEstudiante(@RequestParam(value = "matricula") int matricula,
                                    @RequestParam(value = "nombre") String nombre,
                                    @RequestParam(value = "apellido") String apellido,
                                    @RequestParam(value="telefono")String telefono){
        Estudiante estudiante = new Estudiante(matricula, nombre, apellido, telefono);
        estudianteRepository.save(estudiante);
        return "redirect:/estudiante/";
    }

    @RequestMapping(value = "/guardarCambios", method = RequestMethod.POST)
    public String guardarCambios(@RequestParam(value = "matricula") int matricula,
                                 @RequestParam(value = "nombre") String nombre,
                                 @RequestParam(value = "apellido") String apellido,
                                 @RequestParam(value="telefono")String telefono){
        Estudiante estudiante = estudianteRepository.findByMatricula(matricula);
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setTelefono(telefono);
        estudianteRepository.save(estudiante);
        return "redirect:/estudiante/";
    }

}
