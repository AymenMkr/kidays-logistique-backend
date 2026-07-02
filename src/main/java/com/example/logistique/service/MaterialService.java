package com.example.logistique.service;

import com.example.logistique.entity.Material;
import com.example.logistique.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    public Optional<Material> getMaterialById(Long id) {
        return materialRepository.findById(id);
    }

    public Material createMaterial(Material material) {
        return materialRepository.save(material);
    }

    public Material updateMaterial(Long id, Material materialDetails) {
        Material material = materialRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Matériel non trouvé"));

        material.setNom(materialDetails.getNom());
        material.setDescription(materialDetails.getDescription());
        material.setCategorie(materialDetails.getCategorie());
        material.setEtat(materialDetails.getEtat());
        material.setQuantite(materialDetails.getQuantite());
        material.setPrixEstime(materialDetails.getPrixEstime());
        material.setDisponible(materialDetails.isDisponible());

        return materialRepository.save(material);
    }

    public void deleteMaterial(Long id) {
        materialRepository.deleteById(id);
    }
}