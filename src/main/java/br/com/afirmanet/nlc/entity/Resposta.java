package br.com.afirmanet.nlc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@Table(name = "respostas")
@EqualsAndHashCode(of = "id")
@ToString(exclude = { "perguntas" })
public class Resposta implements Serializable {
	private static final long serialVersionUID = -4276991852035559664L;

	@Id
	@SequenceGenerator(name = "sq_respostas", sequenceName = "sq_respostas", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_respostas")
	@Column(name = "id_resposta")
	private Integer id;

	private String titulo;
	private String definicao;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_resposta")
	private List<Pergunta> perguntas;
	
}
