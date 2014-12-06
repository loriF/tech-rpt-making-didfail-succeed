SHELL=/bin/bash

texfile=tech-report

default: paper

paper: ${texfile}.tex content/*.tex  content/*.tex
	pdflatex ${texfile}
	bibtex ${texfile}
	makeindex ${texfile} -s ${texfile}.ist ${texfile}.idx
	pdflatex ${texfile}
	pdflatex ${texfile}

quick: ${texfile}.tex content/*.tex  content/*.tex
	pdflatex ${texfile}
	bibtex ${texfile}

clean:
	$(RM) ${texfile}.{log,brf,blg,bbl,out,aux,ind,ilg,toc,lot,lof,idx}
	$(RM) content/*.aux
