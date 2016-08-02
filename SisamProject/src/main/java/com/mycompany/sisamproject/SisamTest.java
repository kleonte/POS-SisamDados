/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sisamproject;

import com.mycompany.sisam.cidades.CidadesService;
import com.mycompany.sisam.cidades.CidadesServiceService;
import com.mycompany.sisam.mesano.MesAnoService;
import com.mycompany.sisam.mesano.MesAnoServiceService;
import com.mycompany.sisam.tabulacao.TabulacaoService;
import com.mycompany.sisam.tabulacao.TabulacaoServiceService;
import com.mycompany.sisam.tabulacao.VariaveisView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kleonte
 */
public class SisamTest {

    public static void main(String[] args) {
        CidadesServiceService cidadesServiceService = new CidadesServiceService();
        CidadesService cidadesService = cidadesServiceService.getCidadesWebService();
        cidadesService.getMunicipios("Campina Grande").forEach(m -> System.out.println(m.getUf()));
        
        MesAnoServiceService mesAnoServiceService = new MesAnoServiceService();
        MesAnoService mesAnoService = mesAnoServiceService.getMesAnoWebService();
//        mesAnoService.getAnos();
        
        TabulacaoServiceService tabulacaoServiceService = new TabulacaoServiceService();
        TabulacaoService tabulacaoService = tabulacaoServiceService.getTabulacaoWebService();
        
        String opcData = "ano"; 
        String dataInicial = "2012-09-20";
        String dataFinal = "2003-09-20";
        List<String> mes = null;
        List<String> ano = mesAnoService.getAnos();        
        String opcEstMun = "municipio";
        List<String> estado = null;
        
        List<String> municipio = new ArrayList<>();
        municipio.add("3976");
        
        List<String> vars = new ArrayList<>();
        vars.add("geada");        
        
        List<VariaveisView> dadosTabulados = tabulacaoService.getDadosTabulados(opcData, dataInicial, dataFinal, mes, ano, opcEstMun, estado, municipio, vars);
        System.out.println(dadosTabulados.toString());
    }
}