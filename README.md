# Comparativo de Carros - Android App

> Aplicativo desenvolvido em **Java** para dispositivos Android que funciona como um catálogo e comparativo de veículos sedãs, permitindo selecionar modelos, visualizar especificações detalhadas e navegar entre múltiplas activities.

---

## 📱 Sobre o Projeto

Este aplicativo foi construído para demonstrar conceitos fundamentais do desenvolvimento Android nativo utilizando Java e XML. Ele apresenta três modelos de carros de destaque (Volkswagen Virtus Exclusive, Toyota Corolla e Volkswagen Jetta GLI), gerenciando estados de seleção, passagem de dados via `Intent` e navegação limpa entre telas de detalhes.

---

## 🚀 Funcionalidades

- **Seleção Dinâmica:** Clique nas miniaturas para alternar instantaneamente a imagem principal e atualizar o status do veículo escolhido.
- **Validação de Seleção:** Mensagem de aviso (`Toast`) caso o usuário tente acessar os detalhes sem selecionar nenhum carro previamente.
- **Passagem de Dados:** Envio do nome do veículo selecionado da `MainActivity` para as telas de detalhes utilizando extras em `Intent`.
- **Telas de Detalhes Específicas:** Activities separadas para cada modelo contendo ficha técnica completa (motorização, potência, câmbio, porta-malas e desempenho).
- **Botões de Ação:** 
  - **Detalhes:** Abre a tela correspondente ao veículo escolhido.
  - **Limpar:** Reseta o estado da tela principal para o modo padrão.
  - **Voltar:** Retorna à tela principal mantendo o aplicativo fluido através de `finish()`.

---

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java
- **Ambiente de Desenvolvimento:** Android Studio
- **Componentes de UI:** `ImageView`, `TextView`, `Button`, `ScrollView`, `LinearLayout`
- **Gerenciamento de Fluxo:** Intents explícitas, `putExtra`, `getIntent()` e ciclo de vida de Activities.
