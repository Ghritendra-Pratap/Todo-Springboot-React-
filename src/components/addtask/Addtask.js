import axios from 'axios';
import React, { useRef } from 'react'
import { useNavigate } from 'react-router-dom'


const Addtask = () => {
   
    const title  = useRef();
    const descp = useRef(); 
    const history = useNavigate();
    
    const handleSubmit= async(e)=>{
        e.preventDefault()
        const task={
            tasktitle:title.current.value,
            taskdesc:descp.current.value
        }
        
        try{
            await axios.post("http://localhost:7090/addtask" , task)
            history("/")
        }catch(err){
            console.log(err)
        } 
    }
  return (
    
    <div>Addtask

        <div>
            <form onSubmit={handleSubmit}>
                <div><span>title</span><input type="text" name = "title" ref={title}/></div>
                <div><span>description</span><input type="text" name="descp" ref={descp}/></div>
                <button  name="sub">Signup</button>
            </form>
        </div>
    </div>
  )
}

export default Addtask