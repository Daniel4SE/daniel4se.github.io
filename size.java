\documentclass[a4paper,20pt]{article}

\usepackage{latexsym}
\usepackage[empty]{fullpage}
\usepackage{titlesec}
\usepackage{marvosym}
\usepackage[usenames,dvipsnames]{color}
\usepackage{verbatim}
\usepackage{enumitem}
\usepackage[pdftex]{hyperref}
\usepackage{fancyhdr}

% personal figure
\usepackage[utf8]{inputenc}
\usepackage{graphicx}
\usepackage{wrapfig}
\usepackage{picinpar}
\usepackage{cutwin}
\usepackage[export]{adjustbox}

\pagestyle{fancy}
\fancyhf{} % clear all header and footer fields
\fancyfoot{}
\renewcommand{\headrulewidth}{0pt}
\renewcommand{\footrulewidth}{0pt}

% Adjust margins
\addtolength{\oddsidemargin}{-0.530in}
\addtolength{\evensidemargin}{-0.375in}
\addtolength{\textwidth}{1in}
\addtolength{\topmargin}{-.45in}
\addtolength{\textheight}{1in}

\urlstyle{rm}

\raggedbottom
\raggedright
\setlength{\tabcolsep}{0in}

% Sections formatting
\titleformat{\section}{
  \vspace{-10pt}\scshape\raggedright\large
}{}{0em}{}[\color{black}\titlerule \vspace{-6pt}]

%-------------------------
% Custom commands
\newcommand{\resumeItem}[2]{
  \item\small{
    \textbf{#1}{: #2 \vspace{-2pt}}
  }
}

\newcommand{\resumeItemWithoutTitle}[1]{
  \item\small{
    {\vspace{-2pt}}
  }
}

\newcommand{\resumeSubheading}[4]{
  \vspace{-1pt}\item
    \begin{tabular*}{0.97\textwidth}{l@{\extracolsep{\fill}}r}
      \textbf{#1} & #2 \\
      \textit{#3} & \textit{#4} \\
    \end{tabular*}\vspace{-5pt}
}
\newcommand{\myResumeItem}[2]{\item \small {#1} {#2}\vspace{-3pt}}


\newcommand{\resumeSubItem}[2]{\resumeItem{#1}{#2}\vspace{-3pt}}

\renewcommand{\labelitemii}{$\circ$}

\newcommand{\resumeSubHeadingListStart}{\begin{itemize}[leftmargin=*]}
\newcommand{\resumeSubHeadingListEnd}{\end{itemize}}
\newcommand{\resumeItemListStart}{\begin{itemize}}
\newcommand{\resumeItemListEnd}{\end{itemize}\vspace{-5pt}}


%-----------------------------
%%%%%%  CV STARTS HERE  %%%%%%

\begin{document}

\begin{minipage}[t]{1.0\textwidth}
  \begin{center}      
  \textbf{{\huge Xunzhu Tang}}  \vspace{5pt} \\
    Postdoc at TruX, Snt, University of Luxembourg\\ 
    Email: \href{mailto:}{xunzhu.tang@uni.lu / realdanieltang@gmail.com}
  \end{center}

   

     %HomePage: \url{https://daniel4se.github.io} 
     \hfill Address: 6, rue Richard Coudenhove-Kalergi L-1359 Luxembourg \vspace{1pt}
     % \\ 
     % Citations: 445, h-index: 8, i10-index: 13 
     
     %\hfill Email: \href{mailto:}{tianhaoyemail@gmail.com} 
     %\\
     \href{https://scholar.google.com/citations?hl=en&user=MxpAtQoAAAAJ&view_op=list_works&sortby=pubdate}{Google scholar}, \href{https://dblp.org/pid/243/4169.html}{DBLP}, \href{https://orcid.org/my-orcid?orcid=0000-0002-6377-0884}{ORCID} \hfill Mobile: +352 661-575-801 
\end{minipage}


\vspace{1pt}

\section{Research Interests}
\begin{description}[font=$\bullet$]
\item {LLM-based Agents for Software Engineering}
\vspace{-6pt}
\item {Patch Representation and Exploration}
\vspace{-6pt}
\item {Automatic Programm Repair}
\vspace{-6pt}
\item {Large Code (Language) Model/Platform}
\vspace{-6pt}
\item {Security in Software/Foundation Models}
\vspace{-6pt}
% \vspace{-6pt}
% \item {AI4SE and Machine Learning in general}
% \vspace{-6pt}
% \item {Automated Program Repair}
% \vspace{-6pt}
% \item {AI4SE}
% \item {Machine/Deep Learning}
\end{description}


    


\vspace{1pt}
\section{Work Experience}


  \resumeSubHeadingListStart

    \resumeSubheading{Enoch Tech LTD}{Lancaster, UK}
    {Co-Founder}{May 2024 - July 2025}
    \resumeItemListStart
        \resumeItem{Work Goal}
          % {Fine-Tuning for Enhanced Program Repair with LLMs} 
          {We are developing and achieving a call-graph-driven, repository-level, and low-code smart IDE.} 
        % \resumeItem{Research Output}
          % {[18,19]} 
        \resumeItemListEnd
    \resumeSubheading{University of Luxembourg}{Luxembourg, Luxembourg}
    {Post Doctor}{July 2025 - Present}
    \resumeItemListStart
        \resumeItem{Work Goal}
          % {Fine-Tuning for Enhanced Program Repair with LLMs} 
          {1) Call-graph-driven, repository-level, and low-code smart IDE; 2) Codebase-Level Programm Repair; 3) Attach and Defence in LLM; 4) LLM Patching: 5) LLM Optimization } 
        % \resumeItem{Research Output}
          % {[18,19]} 
        \resumeItemListEnd
    
    % \resumeSubheading{Mind Bridge AI}{Beijing, China}
    % {CEO}{March 2023 - Present}
    % \resumeItemListStart
    %     \resumeItem{Work Goal}
    %       {We aim to teach and spread AI techniques to traditional development software engineers.} 
    %     % \resumeItem{Research Output}
    %       % {[14,15,16,17,20,21,22,23,24]} 
    % \resumeItemListEnd


\resumeSubHeadingListEnd

%-----------Education-----------------
\vspace{1pt}
\section{Education}
  \resumeSubHeadingListStart
    \resumeSubheading
      {University of Luxembourg}{Esch-Sur-Alzette, Luxembourg}
      {Doctor in Computer Science - supervised by Prof. Tegawendé F. Bissyandé}{Ocb 2021 - July 2025}
      \resumeItemListStart
        \resumeItem{Research Goal}
          {Learning how to represent, review, explain, and debug codes. } 
        % \resumeItem{Research Output}
          % {[3,4,5,6,7,8]} 
        \resumeItemListEnd
    \vspace{6pt}
    
 \resumeSubheading
      {Huazhong University of Science and Technology}{Wuhan, China}
      {Master of System and Architecture - advised by Prof. Hai Jin}{Sep 2016 - June 2021}
        \resumeItemListStart
        \resumeItem{Thesis}
          {Research and Implementations of Text Classification Based on Semantic Enhancing} 
        % \resumeItem{Research Output}
          % {[9,25]} 
         \resumeItemListEnd
    \vspace{6pt}
    
    \resumeSubheading
      {Guangxi University}{Nanning, China}
      {Bachelor of Information Management and Information System}{Sep 2012 - June 2016}

    \resumeSubHeadingListEnd




    


\vspace{1pt}
\section{Funding Experience}


  \resumeSubHeadingListStart

    \resumeSubheading{EU Project (under review)}{UNI}
    {Key contributor}{}
    \resumeItemListStart
        \resumeItem{Work Goal}
          % {Fine-Tuning for Enhanced Program Repair with LLMs} 
          {Smart IDE for Coding} 
        % \resumeItem{Research Output}
          % {[18,19]} 
        \resumeItemListEnd
    \resumeSubheading{ERC, H2020, Grant number: 949014}{Luxembourg, Luxembourg}
    {W4 key contributor}{Ocb 2021 - July 2025}
    \resumeItemListStart
        \resumeItem{Work Goal}
         {Automating the analysis and generation of code changes with foundation models. }
        % \resumeItem{Research Output}
          % {[18,19]} 
        \resumeItemListEnd
    
    % \resumeSubheading{Mind Bridge AI}{Beijing, China}
    % {CEO}{March 2023 - Present}
    % \resumeItemListStart
    %     \resumeItem{Work Goal}
    %       {We aim to teach and spread AI techniques to traditional development software engineers.} 
    %     % \resumeItem{Research Output}
    %       % {[14,15,16,17,20,21,22,23,24]} 
    % \resumeItemListEnd


\resumeSubHeadingListEnd





\vspace{-5pt}
\section{Research Works Under Review}
% \resumeSubHeadingListStart
\begin{enumerate}[leftmargin=*]
\setcounter{enumi}{27} % Set the starting number to the total number of items

\item { {\bf [TACL]} \textbf{Xunzhu Tang}, Jacques Klein, Tegawendé F. Bissyandé,  CODEREPAIR: Structure-Aware Repository-Level Program Repair without Problem Statements. Under review in TACL}
\addtocounter{enumi}{-2}

\item { {\bf [ASE'25]}  
\textbf{Xunzhu Tang}, Iyiola Emmanuel Olatunji, Tiezhu Sun,
Jacques Klein, Tegawendé F. Bissyandé,  Reinforcement Learning-Guided Chain-of-Draft for Token-Efficient Code Generation. Under review in ASE'25}
\addtocounter{enumi}{-2}


\item { {\bf [TOSEM'25]}  
\textbf{Xunzhu Tang}, Jacques Klein, Tegawendé F. Bissyandé,  
Boosting Open-Source LLMs for Program Repair via Reasoning Transfer and LLM-Guided Reinforcement Learning. Under review in TOSEM'25}
\addtocounter{enumi}{-2}





\end{enumerate}

\vspace{-5pt}
\section{Publications (Accepted)}
% \resumeSubHeadingListStart
\begin{enumerate}[leftmargin=*]
\setcounter{enumi}{23} % Set the starting number to the total number of items


\item { {\bf [EMSE'25]}  
\textbf{Xunzhu Tang}, Haoye Tian, Weiguo Pian, Saad Ezzini
Abdoul Kader Kabore, Andrew Habib, Kisub KimJacques Klein, Tegawendé F. Bissyandé,  Learning to Represent Code Changes. Accepted in Empirical Software Engineering, 2025}
\addtocounter{enumi}{-2}

\item { {\bf [ICSME'25]} \textbf{Xunzhu Tang}, Tiezhu Sun, Yewei Song, Siyuan Ma, Jacques Klein and Tegawendé Bissyande,  ExpertCache: GPU-Efficient MoE Inference through Reinforcement Learning-Guided Expert Selection. In {\em The 41st International Conference on Software Maintenance and Evolution}, NIER track, 2025.} {\bf (CORE A)}
\addtocounter{enumi}{-2}

\item { {\bf [ACL'25]} \textbf{Xunzhu Tang}, Jiechao Gao, Jin Xu, Tiezhu Sun, Yewei Song, Saad Ezzini, Wendkûuni C. Ouédraogo, Jacques Klein, Tegawendé Bissyande. SynFix: Dependency-Aware Program Repair via RelationGraph Analysis. In {\em the 63rd Annual Meeting of the Association for Computational Linguistics}, Findings, 2025.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [TOSEM'25]} \textbf{Xunzhu Tang}, Kisub Kim, Saad Ezzini, Yewei Song, Haoye Tian, Jacques Klein, Tegawendé F. Bissyandé. Just-in-Time Detection of Silent Security Patches. In {\em ACM Transactions on Software Engineering and Methodology}, 2025.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [EMNLP'24]} \textbf{Xunzhu Tang}, Kisub Kim, Yewei Song, Cedric Lothritz, Bei Li, Saad Ezzini, Haoye Tian, Jacques Klein, and Tegawendé F. Bissyandé. CodeAgent: Autonomous Communicative Agents for Code Review. In {\em 2024 Conference on Empirical Methods in Natural Language Processing}, 2024.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [ICSE'24]} \textbf{Xunzhu Tang}, Haoye Tian, Zhenghan Chen, Weiguo Pian, Saad Ezzini, Abdoul Kader Kabore, Andrew Habib, Jacques Klein, Tegawende F. Bissyande. Learning to Represent Patches. In {\em 46th International Conference on Software Engineering: Companion Proceedings}, Poster track, 2024.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [ICLR'24]} \textbf{Xunzhu Tang}, Yewei Song, Haoye Tian, Zhenghan Chen, Jacques Klein, Tegawendé F. Bissyandé. Semantic Patch Embedding for Security Detection: A Fine-to-Coarse Grained Approach. In {\em 12th International Conference on Learning Representations}, Tiny track, 2024.}  {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [EMSE'24, ASE'24 Journal First]} \textbf{Xunzhu Tang}, Haoye Tian, Pingfan Kong, Saad Ezzini, Kui Liu, Xin Xia, Jacques Klein, Tegawendé F Bissyande. App Review Driven Collaborative Bug Finding. {\em Empirical Software Engineering and In the 39th IEEE/ACM International Conference on Automated Software Engineering}, 2024. {\bf (CORE A*) }}
\addtocounter{enumi}{-2}

\item { {\bf [ASE'25]} Tiezhu Sun, Marco Alecci, Yewei Song, \textbf{Xunzhu Tang}, Kisub Kim, Jordan Samhi, Tegawendé F. Bissyandé , Jacques Klein,  RAML: Toward Retrieval-Augmented Localization of Malicious Payloads in Android Apps. In {\em The 40th IEEE/ACM International Conference on Automated Software Engineering}, NIER track, 2025.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [ASE'25]} Yewei Song, Tiezhu Sun,\textbf{Xunzhu Tang}, Prateek Kumar Rajput, Tegawendé F. Bissyandé and Jacques Klein, Measuring LLM Code Generation Stability via Structural Entropy. In {\em The 40th IEEE/ACM International Conference on Automated Software Engineering}, NIER track, 2025.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}


\item { {\bf [ICSME'25 NIER]} Tiezhu Sun, Marco Alecci, Aleksandr Pilgun, Yewei Song,\textbf{Xunzhu Tang}, Jordan Samhi, Tegawendé F. Bissyandé and Jacques Klein, MalLoc: Towards Fine-grained Android Malicious Payload Localization via LLMs. In {\em The 41st International Conference on Software Maintenance and Evolution}, 2025.} {\bf (CORE A)}
\addtocounter{enumi}{-2}


\item { {\bf [EASE'25]} Yewei Song, \textbf{Xunzhu Tang}, Cedric Lothritz, Saad Ezzini, Jacques Klein, Tegawendé Bissyande, Andrey Boytsov, Ulrick Ble and Anne Goujon. CallNavi, A challenge and empirical study on LLM function calling and routing. In {\em The 29th International Conference on Evaluation and Assessment in Software Engineering}, 2025.} {\bf (CORE A)}
\addtocounter{enumi}{-2}





\item { {\bf [TOSEM'24]} Weiguo Pian, Yinghua Li, Haoye Tian, Tiezhu Sun, Yewei Song, \textbf{Xunzhu Tang}, Andrew Habib, Jacques Klein, Tegawendé F. Bissyande. You Don't Have to Say Where to Edit! Joint Learning to Localize and Edit Source Code. In {\em ACM Transactions on Software Engineering and Methodology}, 2024.} {\bf (CORE A*)}




\addtocounter{enumi}{-2}

\item { {\bf [ASE'24]} Kisub Kim, Jounghoon Kim, Byeongjo Park, Dongsun Kim, Chun Yong Chong, Yuan Wang, Tiezhu Sun, \textbf{Xunzhu Tang*}, Jacques Klein, Tegawendé F Bissyandé. DataRecipe---How to Cook the Data for CodeLLM?. In {\em 39th EEE/ACM International Conference on Automated Software Engineering}, 2024.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [ICSE2025'24]} Gong Chen, Xiaoyuan Xie, \textbf{Xunzhu Tang*}, Qi Xin, Wenjie Liu. HedgeCode: A Multi-Task Hedging Contrastive Learning Framework for Code Search. In {\em IEEE/ACM 47th International Conference on Software Engineering}, 2024.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [ICSE'24 SEIP]} Yewei Song, Saad Ezzini, \textbf{Xunzhu Tang*}, Cedric Lothritz, Jacques Klein, Tegawendé Bissyandé, Andrey Boytsov, Ulrick Ble, Anne Goujon. Enhancing Text-to-SQL Translation for Financial System Design. In {\em the 46th International Conference on Software Engineering: Software Engineering in Practice}, 2024.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}



\item { {\bf [ACL'24]} Yewei Song, Cedric Lothritz, \textbf{Xunzhu Tang*}, Tegawendé Bissyandé, Jacques Klein. Revisiting Code Similarity Evaluation with Abstract Syntax Tree Edit Distance. In {\em 62nd Annual Meeting of the Association for Computational Linguistics (Volume 2: Short Papers)}, 2024.} {\bf (CORE A*)}
\addtocounter{enumi}{-2}

\item { {\bf [NAACL'24]} Dongsheng Zhu, \textbf{Xunzhu Tang*}, Weidong Han, Jinghui Lu, Yukun Zhao, Guoliang Xing, Junfeng Wang, Dawei Yin. Revisiting Code Similarity Evaluation with Abstract Syntax Tree Edit Distance. In {\em 2024 Conference of the North American Chapter of the Association for Computational Linguistics: Human Language Technologies (Volume 1: Long Papers)}, 2024.} {\bf (CORE A)}
\addtocounter{enumi}{-2}





\item { {\bf [Neurocomputing'24]} Song Yang, \textbf{Xunzhu Tang*}. A Large-Scale Microblog Dataset and Stock Movement Prediction Based on Supervised Contrastive Learning Model. {\em Neurocomputing}, 2024. {\bf (CORE B) }}
\addtocounter{enumi}{-2}

\item { {\bf [ACMMM'23]} Zhenghan Chen, Changzeng Fu, Ruoxue Wu, Ye Wang, \textbf{Xunzhu Tang*}, Xiaoxuan Liang. LGFat-RGCN: Faster Attention with Heterogeneous RGCN for Medical ICD Coding Generation. In {\em 31st ACM International Conference on Multimedia}, 2023. {\bf (CORE A*) }}
\addtocounter{enumi}{-2}

\item { {\bf [ASE'23]} Liran Wang, \textbf{Xunzhu Tang*}, Yichen He, Changyu Ren, Shuhua Shi, Chaoran Yan, Zhoujun Li. Delving into commit-issue correlation to enhance commit message generation models. In {\em 38th IEEE/ACM International Conference on Automated Software Engineering}, 2023. {\bf (CORE A*) }}
\addtocounter{enumi}{-2}


\item { {\bf [AAAI'23]} Weiguo Pian, Hanyu Peng, \textbf{Xunzhu Tang*}, Tiezhu Sun, Haoye Tian, Andrew Habib, Jacques Klein, Tegawendé F Bissyandé. MetaTPTrans: A Meta Learning Approach for Multilingual Code Representation Learning. The {\em 37th AAAI Conference on Artificial Intelligence}, 2023. {\bf (CORE A* ) [Acceptance rate: 19.6\% (1,721/8,777)]}}
% \vspace{2pt}
\addtocounter{enumi}{-2}


\item { {\bf [ASE'22]} Haoye Tian, \textbf{Xunzhu Tang*}, Andrew Habib, Shangwen Wang, Kui Liu, Xin Xia, Jacques Klein, Tegawendé F. Bissyandé. Is this Change the Answer to that Problem? Correlating Descriptions of Bug and Code Changes for Evaluating Patch Correctness. In {\em 37th IEEE/ACM International Conference on Automated Software Engineering}, pp. 1-13. 2022. {\bf (CORE A* ) [Acceptance rate: 14.8\% (78/527)]}}
% \vspace{2pt}
\addtocounter{enumi}{-2}

\item { {\bf [DASFAA'22]} Shi Wang, \textbf{Xunzhu Tang*}, Luchen Zhang, Huilin Li, Ding Han. HieNet: Bidirectional Hierarchy Framework for Automated ICD Coding. In {\em 27th International Conference, DASFAA}, 2022. {\bf (CORE B ) }}
% \vspace{2pt}
\addtocounter{enumi}{-2}

%\item { {\bf [ICONIP'21]} Shi Wang, \textbf{Xunzhu Tang*}, Luchen Zhang. A Large-Scale Hierarchical Structure Knowledge Enhanced Pre-training Framework for Automatic ICD Coding. In {\em Neural Information Processing: 28th International Conference, ICONIP}, 2021. {\bf (CORE B ) }}
% \vspace{2pt}
%\addtocounter{enumi}{-2}

%\item { {\bf [ICPR'20]} \textbf{Xunzhu Tang*}, Rujie Zhu, Tiezhu Sun, Shi Wang. Moto: Enhancing Embedding with Multiple Joint Factors for Chinese Text Classification. In {\em 25th International Conference on Pattern Recognition (ICPR)}, 2021. {\bf (CORE B ) }}
% \vspace{2pt}
%\addtocounter{enumi}{-2}

%\item { {\bf [ICPR'20]} \textbf{Xunzhu Tang*}, Tiezhu Sun, Rujie Zhu, Shi Wang. CKG: Dynamic Representation Based on Context and Knowledge Graph. In {\em 25th International Conference on Pattern Recognition (ICPR)}, 2021. {\bf (CORE B ) }}
% \vspace{2pt}
%\addtocounter{enumi}{-2}





% \vspace{2pt}
\end{enumerate}

\vspace{1pt}
\section{Academic Services}

\begin{itemize}[label=\textbullet, noitemsep, leftmargin=*] 
    \item \textbf{Conference}
    \begin{itemize}[label=\textopenbullet, noitemsep, leftmargin=*] 
        \item Organizing Committee
        \begin{itemize}[label=\textendash, noitemsep, leftmargin=*] 
            \item IC'24 Area Co-Chairs at Intelligent Computing System
        \end{itemize}
        \item Program Committee
        \begin{itemize}[label=\textendash, noitemsep, leftmargin=*] 
            \item ACL ARR , NLPCC, AAAI
            \item ICSE, MSR
            \item SOSP'21 artifact
        \end{itemize}
    \end{itemize}
    \vspace{6pt}
    
    \item \textbf{Journal}
    \begin{itemize}[label=\textopenbullet, noitemsep, leftmargin=*] 
        \item Reviewer
        \begin{itemize}[label=\textendash, noitemsep, leftmargin=*] 
            \item Neurocomputing; Automated Software Engineering
            % \item TSE'23, EMSE'23
            % \item TSE'22
        \end{itemize}
    \end{itemize}

\end{itemize}


\vspace{1pt}
\section{Teachings}

\begin{itemize}[label=\textbullet, noitemsep, leftmargin=*] 
    \item \textbf{Teaching}
    \begin{itemize}[label=\textopenbullet, noitemsep, leftmargin=*] 
        \item Principles of Software Development, Master in Information and Conputer Sciences, semestre 2 @UNI
        \item Practice in Industry of Large Language Models, online. 
    \end{itemize}
\end{itemize}


\vspace{1pt}
\section{Supervision or Advision}


  \resumeSubHeadingListStart

    \resumeSubheading{Gong Chen}{Wuhan University, China}
    {PhD Student}{Sept 2023 - Sept 2024}
    \resumeItemListStart
        \resumeItem{Research Work}
          % {Fine-Tuning for Enhanced Program Repair with LLMs} 
          {HedgeCode: A Multi-Task Hedging Contrastive Learning Framework for Code Search, Accepted by ICSE'2025} 
        % \resumeItem{Research Output}
          % {[18,19]} 
        \resumeItemListEnd
    \resumeSubheading{Liran Wang}{Beihang Universitz, Beijing}
    {Phd Student}{Nov 2022 -June 2023}
    \resumeItemListStart
        \resumeItem{Research Work}
          % {Fine-Tuning for Enhanced Program Repair with LLMs} 
          {Delving into commit-issue correlation to enhance commit message generation models, Accepted by ASE'2023} 
        % \resumeItem{Research Output}
          % {[18,19]} 
        \resumeItemListEnd
    \resumeSubheading{Elon Demi}{University of Prishtina, Kosovo}
    {Master Student}{Nov 2022 -June 2023}
    \resumeItemListStart
        \resumeItem{Master Thesis}
          % {Fine-Tuning for Enhanced Program Repair with LLMs} 
          {Does a suggestion from a LLM help another LLM to fix buggy code?} 
        % \resumeItem{Research Output}
          % {[18,19]} 
        \resumeItemListEnd
\resumeSubHeadingListEnd

%-----------Education-----------------
\vspace{1pt}

%-----------Invited Talks-----------------
\section{Invited Talks}
\begin{description}[font=$\bullet$]
\item {CodeAgent: Autonomous Communicative Agents for Code Review, Zhijiang Lab @Zhejiang, China, Dec 2024, Invitation by Dr. Luqi Gong}
\vspace{-6pt}
\item {Autonomous Code Review in Software Engineering, SAP Group, May 2024, Invitation by Michael Laux}
\vspace{-6pt}

\item {Autonomous Code Review, Lancaster University, March 2024, Invitation by Prof. Saad Ezzini}
\end{description}




% \vspace{1pt}
% \section{Teaching \& Mentoring}
% \begin{itemize}[label=\textbullet, noitemsep, leftmargin=*] 
%     \item \textbf{Online Lecturer}
%     \begin{itemize}[label=\textopenbullet, noitemsep, leftmargin=*] 
%         \item 2024 - Gupao Tech LTD: Practical Course Training on Large Language Models (software engineer course, class size: 160)
%     \end{itemize}
%     \vspace{6pt}
    
%     \item \textbf{Mentoring}
%     \begin{itemize}[label=\textopenbullet, noitemsep, leftmargin=*] 
%         \item 2023-2024 Gong Chen, Yu Tong, Wuhan University)
%         \item 2023-2024 Liran Wang, Beihang University
%         \end{itemize}
%         \vspace{6pt}

   
% \end{itemize}

\end{document}