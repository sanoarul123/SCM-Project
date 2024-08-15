// console.log("JS loaded");



let currentTheme = getTheme();


    changeTheme();



function changeTheme(){
    change_theme_content(currentTheme,currentTheme);
    const change_theme=document.querySelector('#theam_change_btn');



     const oldTheme = currentTheme;
    
    change_theme.addEventListener('click',(event) => {





         if(currentTheme == "dark"){

            currentTheme = "light";
           }

         else{
                currentTheme="dark";
         }
  
         change_theme_content(currentTheme,oldTheme);
      
     });
}

function setTheme(theme)
{
    localStorage.setItem("theme",theme);
}

function getTheme()
{
    let theme = localStorage.getItem("theme");
    
    return theme ? theme : "light";

}

function change_theme_content(theme,oldTheme){
    setTheme(currentTheme);



        
    document.querySelector("html").classList.remove(oldTheme);

    document.querySelector("html").classList.add(theme);

    document.querySelector("#theam_change_btn").querySelector("span").textContent = theme == "light" ? "Dark" : "Light";


}
