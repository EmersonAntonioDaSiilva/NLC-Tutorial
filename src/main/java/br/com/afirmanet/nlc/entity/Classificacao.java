package br.com.afirmanet.nlc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@Table(name = "classificacoes")
@EqualsAndHashCode(of = "id")
@ToString()
public class Classificacao implements Serializable {
	private static final long serialVersionUID = -635040727719660480L;

	@Id
	@SequenceGenerator(name = "sq_classificacoes", sequenceName = "sq_classificacoes", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_classificacoes")
	@Column(name = "id_classificacao")
	private Integer id;

	private String pergunta;
	private String resposta;
	private Double confidence;
	
	private Integer sentimento;
	
	private LocalDateTime dataCadastro;
	private LocalDateTime dataClassificacao;

	private String classifier;
	
	@Transient
	public String getDataCadastroFormatMesAno(){
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MM/yyyy");
		
		return dataCadastro.format(pattern);
	}
	
	@Transient
	public Integer getRegistro(){
		return 1;
	}
}
