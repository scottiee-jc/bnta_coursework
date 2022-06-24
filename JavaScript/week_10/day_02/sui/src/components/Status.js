const Status = ({applicationsOpen, handleButtonClick}) => {

    return (
        <>
            <p>Applications are {applicationsOpen ? "open" : "closed"}.</p>
            <button onClick={handleButtonClick}>Open/Close Applications</button>

            {/* ternery syntax - after ? is thing todo the if value = true, after : is thing todo if value = false */}
        </>
    )
}

export default Status;