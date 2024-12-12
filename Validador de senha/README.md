
# 🚀 Validador de Senhas  

Projeto de **orientação a objetos** com foco na validação de senhas seguras.

---

## 📜 Funcionalidades  

Valida senhas com base nos seguintes critérios:  

✅ Pelo menos **8 caracteres**  
✅ Contém **número**  
✅ Contém **caractere especial** (!@#$%^&*()-+=)  
✅ Contém **letra maiúscula**  

---

## ⚙️ Configuração  

1. Clone o repositório:  
   ```bash
   git clone https://gabi-ulisses.git
   cd orientação-a-objetos/Validador\ de\ senha
   ```

2. Compile:  
   ```bash
   mvn clean install
   ```

---

## 🚀 Executando  

```bash
mvn exec:java -Dexec.mainClass="com.ibag.validator.Main"
```

---

## 🧪 Testes  

Execute:  
```bash
mvn test
```