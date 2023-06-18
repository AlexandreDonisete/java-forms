package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.CadastroCliente;


public class ModeloForm extends AbstractTableModel {

    private List<CadastroCliente> dados = new ArrayList();
    private String[] colunas = {"Nome", "E-mail", "Sexo", "CPF", "Telefone","Data de Nascimento"};
    
    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {
            case 0:
                return dados.get(linha).getNomeCompleto();
            case 1:
                return dados.get(linha).getEmail();
            case 2:
                return dados.get(linha).getSexo();
            case 3: 
                return dados.get(linha).getCpf();
            case 4:
                return dados.get(linha).getTelefone();
            case 5:
                return dados.get(linha).getNascimento();
                
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna) {
            case 0:
                dados.get(linha).setNomeCompleto((String) valor);
                break;
            case 1:
                dados.get(linha).setEmail((String) valor);
                break;
            case 2:
                dados.get(linha).setSexo((String) valor);
                break;
            case 3: 
                dados.get(linha).setCpf((String) valor);
                break;
            case 4:
                dados.get(linha).setTelefone((String) valor);
                break;
            case 5:
                dados.get(linha).setNascimento((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public CadastroCliente getCliente(int linha) {
        return dados.get(linha);
    }
    
    public void addRow(CadastroCliente c) {
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}
