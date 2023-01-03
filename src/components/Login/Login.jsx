import React from 'react'

const Login = () => {
    const username =useRef();
    const password =useRef();
    const handleSubmit=(e)=>{
      e.preventDefault()
      
        login(username=username.current.value,password=password.current.value)
      useNavigate("./Tasklist")
  
      
    }
    return (
      <div onSubmit={handleSubmit}>
        <form>
        username:<input type="text" ref={username} />
        password:<input type="password" ref={password}/>
        <button>Login</button>
        </form>
        
      </div>
  )
}

export default Login