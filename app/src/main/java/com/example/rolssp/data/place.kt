package com.example.rolssp.data

import androidx.annotation.DrawableRes
import com.example.rolssp.R

/**
 * photoName = nome doarquivo em res/drawable (sem extensão).
 * Se a foto ainda não existir, o app usa R.drawable.placeholder.
 */
data class Place(
    val name: String,
    @DrawableRes val photoName: Int
)

object PlacesRepo {
    val all = listOf(
        Place("Beco das Artes", R.drawable.beco_das_artes),
        Place("Beco do Batman", R.drawable.beco_do_batman),
        Place("Biblioteca Narbal Fontes", R.drawable.biblioteca_publica_narbal),
        Place("Caixa Cultural", R.drawable.caixa_cultural_s_o_paulo___edif_cio_s_),
        Place("Capela de Santa Catarina", R.drawable.capela_santa_catarina),
        Place("Capela Santa Luzia", R.drawable.capela_santa_luzia),
        Place("Casa Bradesco", R.drawable.casa_bradesco),
        Place("Casa das Caldeiras", R.drawable.casa_das_caldeiras),
        Place("Casa das Rosas", R.drawable.casa_das_rosas),
        Place("Casa do Bandeirante", R.drawable.casa_do_bandeirante),
        Place("Casa do Grito", R.drawable.casa_do_grito),
        Place("Casa Guilherme de Almeida", R.drawable.casa_guilherme_de_almeida),
        Place("CasaMário de Andrade", R.drawable.casa_mario_de_andrade),
        Place("Casa Modernista",R.drawable.casa_modernista),
        Place("Centro Cultural Coreano", R.drawable.centro_cultural_coreano),
        Place("Centro Cultural Fiesp", R.drawable.centro_cultural_fiesp),
        Place("Centro CulturalSão Paulo", R.drawable.centro_cultural_sao_paulo),
        Place("Centro Histórico", R.drawable.centro_historico_de_sao_paulo),
        Place("Chácara Lane", R.drawable.chacara_lane),
        Place("Copan", R.drawable.copan_st),
        Place("Galeria Magalu", R.drawable.galeria_magalu),
        Place("Instituto Brasileiro de Teatro", R.drawable.instituto_brasileiro_de_teatro),
        Place("Instituto Moreira Salles", R.drawable.insituto_moreira_salles),
        Place("Instituto Tomie Ohtake", R.drawable.instituto_tomie_ohtake),
        Place("Itaú Cultural", R.drawable.itau_cultural),
        Place("Japan House", R.drawable.japan_house_sao_paulo_fachada),
        Place("Jardim daLuz", R.drawable.jardim_da_luz),
        Place("Liberdade", R.drawable.liberdade),
        Place("MASP", R.drawable.masp),
        Place("Memorial da América Latina", R.drawable.memorial_da_america_latina),
        Place("Memorial da Resistência", R.drawable.memorial_da_resistencia),
        Place("Minhocão", R.drawable.minhocao),
        Place("Museu Afro", R.drawable.museu_afro),
        Place("Museu da Arte Sacra", R.drawable.museu_de_arte_sacra),
        Place("Museu da Bolsa", R.drawable.museu_da_bolsa_do_brasil),
        Place("Museu da Bruxaria", R.drawable.museu_da_bruxaria),
        Place("Museu da Imigração", R.drawable.museu_da_imigracao),
        Place("Museu da Língua Portuguesa", R.drawable.museu_da_lingua_portuguesa),
        Place("Museu da Santa Casa", R.drawable.museu_da_santa_casa),
        Place("Museu da Saúde Pública", R.drawable.museu_da_saude_publica),
        Place("Museu de Zoologia", R.drawable.museu_de_zoologia),
        Place("Museu do Óculos", R.drawable.museu_dos_culos),
        Place("Museu Ema Klabin", R.drawable.museu_ema_klabin),
        Place("Museu Lasar Segall", R.drawable.museu_lasar_segall),
        Place("Museu Vicentede Azevedo", R.drawable.museu_vicente_de_azevedo),
        Place("NUCLE1",R.drawable.nucle1),
        Place("Orquidário Ruth Cardoso", R.drawable.orquidario_ruth_cardoso),
        Place("Parque Augusta", R.drawable.parque_augusta),
        Place("Parque Burle Marx", R.drawable.paruqe_burle_marx),
        Place("Parque da Independência", R.drawable.parque_da_independencia),
        Place("Parque do Carmo", R.drawable.parque_do_carmo),
        Place("Parque do Ibirapuera", R.drawable.parque_do_ibirapuera_cidade_de_sao_paulo),
        Place("Parque do Povo", R.drawable.parque_do_povo),
        Place("Parque Villa-Lobos", R.drawable.parque_villa_lobos),
        Place("Passagem Literária da Consolação", R.drawable.passagem_literaria_consolacao),
        Place("Pinacoteca", R.drawable.pinacoteca),
        Place("Pinakotheke", R.drawable.pinakotheke),
        Place("Praça Buenos Aires", R.drawable.praca_buenos_aires),
        Place("Praça das Artes", R.drawable.praca_das_artes_por_nelson_kon),
        Place("Rua Avanhandava", R.drawable.rua_avanhandava),
        Place("Sesc 24 de Maio", R.drawable.sesc_24_de_maio),
        Place("Sesc Paulista", R.drawable.sesc_paulista),
        Place("Tribunal de Justiça", R.drawable.tribunal_de_justi_a_sao_paulo),
        Place("Vila Itororó",R.drawable.vila_itororo),
        Place("Vila Portuguesa", R.drawable.vila_portuguesa_liberdade)
    )}