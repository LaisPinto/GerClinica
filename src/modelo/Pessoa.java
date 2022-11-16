
package modelo;

/**
 *
 * @author AndreyFernandesTraja
 */
public class Pessoa {
    private int idpessoa;
    private String nome = "";
    private String estCivil = "";
    private String etinia = "";
    private String sexo = "";
    private String rg;
    private String endereco = "";
    private String num;
    private String cep;
    private String cidade = "";
    private String estado = "";
    private String tel;
    private String login;
    private String senha;
    private String crm;
    private int tipo;
    private int idpaciente;
    private int idmedico;
    
    //contrutor
    public Pessoa() {
        
    }
    
     public Pessoa(int id, String nome, String estCivil, String etnia, String sexo, String rg, String nacionalidade, String endereco, String num, String cep, String cidade, String estado, String tel, String login, String senha, String crm, int tipo) {
        this.idpessoa = idpessoa;
        this.nome = nome;
        this.estCivil = estCivil;
        this.etinia = etnia;
        this.sexo = sexo;
        this.rg = rg;
        this.endereco = endereco;
        this.num = num;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.tel = tel;
        this.login = login;
        this.senha = senha;
        this.crm = crm;
        this.tipo = tipo;
    }

    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getEtinia() {
        return etinia;
    }

    public void setEtinia(String etinia) {
        this.etinia = etinia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public int getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }
    
    
}
