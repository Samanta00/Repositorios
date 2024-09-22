import React from "react";
import ListaProjeto from '../Lista_projeto/index'
import LayoutPerfil from '../Layout_perfil/index'



function PageHome(){
return(
    <div className="PagesHome">
        <LayoutPerfil/>
        <ListaProjeto/>


    </div>
)
}

export default PageHome;